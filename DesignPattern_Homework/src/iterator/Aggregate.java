package iterator;

// An aggregation interface for the class TotalSalesInfo
// to implement

//æ€∫œ¿‡

public interface Aggregate {
   public abstract EvenNumIterator createEvenNumIterator();
   public abstract OddNumIterator createOddNumIterator();
   public abstract CircularIterator createCircularIterator();
   //
   public abstract DiagonalIterator createDiagonalIterator();
   
}