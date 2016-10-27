package iterator;

import java.util.ArrayList;
/*
   import java.util.*;
   import java.lang.Integer;
   import java.util.Iterator;
 */
//添加 矩阵对角线变换 算法

public class DiagonalIterator implements NumberIterator {
	private ArrayList<Integer> numList =new ArrayList<Integer>();
	//
	private int numOfElements = 0;
    int nextNum;
    int counter=0;
    int nextIndex=-1;

    int[][] mat ;
   	int len=0;
   	int top=0;
   	int bottom;
   	int leftEdge=0;
	int rightEdge;
//
	 public DiagonalIterator(Matrix mx){
		   mat = mx.getMatrixData();
		   len = mx.getLength();
		   bottom=len-1;
		   rightEdge=len-1;

	       loadDataFromMatrixToArrayList();
	    }
	
private void loadDataFromMatrixToArrayList() {
			for(int loopCount = 0; loopCount<=len/2; loopCount++) {
					  for(int n=leftEdge; n<=rightEdge; n++)
						  numList.add(new Integer(mat[top][n]));
					  for(int m=top+1; m<=bottom; m++)
						  numList.add(new Integer(mat[m][rightEdge]));
					  for(int n=rightEdge-1; n>=leftEdge; n--)
						  numList.add(new Integer(mat[bottom][n]));
					  for(int m=bottom-1; m>top; m--)
						  numList.add(new Integer(mat[m][leftEdge]));
					  top++;
					  bottom--;
					  leftEdge++;
					  rightEdge--;
			}
}
	//实现 numberIterator抽象方法
	 public boolean hasNext() {
		 //修改
		 if(counter < numList.size()){
	         numOfElements++;
	         nextIndex++;
	         nextNum=numList.get(nextIndex);
	         counter++;
	   		 return true;
		}
	   else
	       return false;
    }
    public int next(){
    	//修改
	       return numList.get(nextIndex);
    }
    public void remove() {
        numList.remove(nextNum);
    }
    public  int getNumOfItems(){
       return numOfElements;
    }

}
