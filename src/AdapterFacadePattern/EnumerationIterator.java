package AdapterFacadePattern;


import java.util.Enumeration;
import java.util.Iterator;

/**
 * Enumeration 기능은 Iterator 기능에 
 */


public class EnumerationIterator implements Iterator {
  private Enumeration enumeration;
  public EnumerationIterator(Enumeration enumeration) {
    this.enumeration = enumeration;
  }

  public boolean hasNext() {
    return enumeration.hasMoreElements();
  }

  public Object next() {
    return enumeration.nextElement();
  }

  public void remove() {
    throw new UnsupportedOperationException();
  }
}
