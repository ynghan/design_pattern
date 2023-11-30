package IteratorPattern.DefineIteratorAndMenuIterator;

import IteratorPattern.MenuItem;

public class DinerMenuIterator implements Iterator {
  private final MenuItem[] items;
  int position = 0;
  public DinerMenuIterator(MenuItem[] items) {
    this.items = items;
  }
  public Object next() {
    MenuItem menuItem = items[position];
    position++;
    return menuItem;
  }

  public boolean hasNext() {
    if(position >= items.length || items[position] == null)
      return false;
    else
      return true;
  }
}
