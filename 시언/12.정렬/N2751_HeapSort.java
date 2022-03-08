package baekjoon;
import java.util.Arrays;
import java.io.*;
import java.util.Comparator;
import java.util.NoSuchElementException;
public class N2751_HeapSort {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		Heap<Integer> heap = new Heap<Integer>(N);
		for(int i = 0; i<N; i++) {
			heap.add(Integer.parseInt(br.readLine()));
		}
		for(int i = 0; i<N; i++) {
			bw.write(Integer.toString(heap.remove()) + '\n');
		}
		bw.flush();
		bw.close();
	}
	
	public static class Heap<E>{
		private final Comparator<? super E> comparator;
		private static final int DEFAULT_CAPACITY = 10;	// �ּ�(�⺻) ���� ũ��
		
		private int size;	// ��� ����
		
		private Object[] array;	// ��Ҹ� ���� �迭
		
		//������ Type 1 (�ʱ� ���� �Ҵ� x)
		public Heap() {
			this(null);
		}
		
		public Heap(Comparator<? super E> comparator) {
			this.array = new Object[DEFAULT_CAPACITY];
			this.size = 0;
			this.comparator = comparator;
		}
		
		// ���� �ε����� �θ� ��� �ε����� ��ȯ
		private int getParent(int index) {
			return index / 2;
		}
		
		// ���� �ε����� ���� �ڽ� ��� �ε����� ��ȯ
		private int getLeftChild(int index) {
			return index * 2;
		}
		
		// ���� �ε����� ������ �ڽ� ��� �ε����� ��ȯ
		private int getRightChild(int index) {
			return index * 2 + 1;
		}
		
		//������ Type 2 (�ʱ� ���� �Ҵ� O)
		public Heap(int capacity) {
			this(capacity, null);
		}
		
		public Heap(int capacity, Comparator<? super E> comparator) {
			this.array= new Object[capacity];
			this.size = 0;
			this.comparator = comparator;
		}
		
		// @param newCapacity ���ο� ���� ũ��
		private void resize(int newCapacity) {
			// ���� ���� �迭
			Object[] newArray = new Object[newCapacity];
			
			// �� �迭�� ������ �ִ� �迭�� ��ҵ��� ��� �������ش�.
			for(int i = 1; i<= size; i++) {
				newArray[i] = array[i];
			}
			// ���� �迭�� GC(Garbage Collector) ó���� ���� null�� ó���� ��, �� �迭�� �������ش�.
			this.array = null;
			this.array = newArray;
		}
		
		public void add(E value) {
			// �迭 ������ �� ������ ��� ������ �� ��� �÷��ش�.
			if(size + 1 == array.length) {
				resize(array.length * 2);
			}
			
			siftUp(size + 1, value);	// ���� �������� �߰� �Ǵ� ��ġ�� ���� ��(Ÿ��)�� �Ѱ���
			size++;	//���������� ���ġ�� ������ ����� ����
		}
		
		// ���� ����
		// @param idx		�߰��� ����� �ε���
		// @param target	���ġ �� ���
		private void siftUp(int idx, E target) {
			// comparator�� ������ ��� comparator�� ���ڷ� �Ѱ��ش�.
			if(comparator != null) {
				siftUpComparator(idx, target, comparator);
			}
			else {
				siftUpComparable(idx, target);
			}
		}
		
		//Comparator�� �̿��� sift-up
		private void siftUpComparator(int idx, E target, Comparator<? super E> comp) {
			// root��庸�� Ŭ �������� �ݺ��Ѵ�.
			while(idx > 1) {
				int parent = getParent(idx);	// ���Գ���� �θ��� �ε��� ���ϱ�
				Object parentVal = array[parent];	// �θ����� ��
				
				// Ÿ�� ��� ���� �θ��庸�� ũ�� �ݺ��� ����
				if(comp.compare(target, (E) parentVal) >= 0) {
					break;
				}
				
				// �θ��尡 Ÿ�ٳ�庸�� ũ�Ƿ� ���� ���� �� ��ġ�� �θ��� ������ ��ü���ְ�
				// Ÿ�� ����� ��ġ�� �θ����� ��ġ�� �������ش�.
				array[idx] = parentVal;
				idx = parent;
			}
			
			// ���������� ���Ե� ��ġ�� Ÿ�� ��� ���� �������ش�.
			array[idx] = target;
		}
		
		// ���� �� ��ü�� Comparable�� �̿��� sift-up
		private void siftUpComparable(int idx, E target) {
			// Ÿ�� ��尡 �� �� �� �ֵ��� �� ������ �����.
			Comparable<? super E> comp = (Comparable<? super E>) target;
			
			while(idx > 1) {
				int parent = getParent(idx);
				Object parentVal = array[parent];
				
				if(comp.compareTo((E)parentVal) >= 0) {
					break;
				}
				array[idx] = parentVal;
				idx = parent;
			}
			array[idx] = comp;
		}
		
		public E remove() {
			if(array[1] == null) {	// ���� root�� ���������� ���ܸ� �������� ��
				throw new NoSuchElementException();
			}
			
			E result = (E) array[1];	// ������ ��Ҹ� ��ȯ�ϱ� ���� �ӽ� ����
			E target = (E) array[size];	// Ÿ���� �� ���
			array[size] = null;	// Ÿ�� ��带 ����.
			
			// ������ ����� �ε����� ���� ���ġ �� Ÿ�� ��带 �Ѱ��ش�.
			siftDown(1, target);	// ��Ʈ ��尡 �����ǹǷ� 1�� �Ѱ��ش�.
			
			return result;
		}
		
		// @param idx		������ ����� �ε���
		// @param target	���ġ �� ���
		private void siftDown(int idx, E target) {
			// comparator�� ������ ��� comparator�� ���ڷ� �Ѱ��ش�.
			if(comparator != null) {
				siftDownComparator(idx, target, comparator);
			}
			else {
				siftDownComparable(idx, target);
			}
		}
		
		// Comparator�� �̿��� sift-down
		private void siftDownComparator(int idx, E target, Comparator<? super E> comp) {
			array[idx] = null;	// ���� �� �ε����� ��带 ����
			size--;
			
			int parent = idx;	// ���������� ���� �� �θ� ����Ű�� ����
			int child;	// ��ȯ �� �ڽ��� ����Ű�� ����
			
			// ���� �ڽ� ����� �ε����� ����� �������� ���� ������ �ݺ�
			while((child = getLeftChild(parent)) <= size) {
				int right = getRightChild(parent);	// ������ �ڽ� �ε���
				Object childVal = array[child];	// ���� �ڽ��� �� (��ȯ �� ��)
				
				// ������ �ڽ� �ε����� size�� ���� �����鼭 ���� �ڽ��� ������ �ڽĺ��� ū ���
				// ���ġ �� ���� ���� �ڽİ� ���ؾ��ϹǷ� child�� childVal�� ������ �ڽ����� �ٲ��ش�.
				if(right <= size && comp.compare((E) childVal, (E) array[right]) > 0) {
					child = right;
					childVal = array[child];
				}
				
				// ���ġ �� ��尡 �ڽ� ��庸�� ������� �ݺ����� �����Ѵ�.
				if(comp.compare(target, (E) childVal) <= 0) {
					break;
				}
				
				// ���� �θ� �ε����� �ڽ� ��� ���� ��ü���ְ� �θ� �ε����� �ڽ� �ε����� ��ü
				array[parent] = childVal;
				parent = child;
			}
			
			// ���������� ���ġ�Ǵ� ��ġ�� Ÿ���� �� ���� �־��ش�.
			array[parent] = target;
			
			// ������ ����� �ּ� �������ٴ� ũ�鼭 ����� ������ ��ü ������ 1/4�ϰ��
			// ������ ������ ����(��, �ּҿ������ٴ� Ŀ����)
			if(array.length > DEFAULT_CAPACITY && size < array.length / 4) {
				resize(Math.max(DEFAULT_CAPACITY, array.length / 2));
			}
		}
		
		// Comparable�� �̿��� sift-down
		private void siftDownComparable(int idx, E target) {
			Comparable<? super E> comp = (Comparable<? super E>) target;
			
			array[idx] = null;
			size--;
			
			int parent = idx;
			int child;
			
			while((child = getLeftChild(parent)) <= size) {
				int right = getRightChild(parent);
				Object childVal = array[child];
				if(right <= size && ((Comparable<? super E>)childVal).compareTo((E)array[right]) > 0) {
					child = right;
					childVal = array[child];
				}
				
				if(comp.compareTo((E) childVal) <= 0) {
					break;
				}
				array[parent] = childVal;
				parent = child;
			}
			array[parent] = comp;
			
			if(array.length > DEFAULT_CAPACITY && size < array.length / 4) {
				resize(Math.max(DEFAULT_CAPACITY, array.length / 2));
			}
		}
		
		public int size() {
			return this.size;
		}
		
		public E peek() {
			if(array[1] == null) {
				throw new NoSuchElementException();
			}
			
			return (E)array[1];
		}
		
		public boolean isEmpty() {
			return size == 0;
		}
		
		public Object[] toArray() {
			return Arrays.copyOf(array, size + 1);
		}
	}

}
