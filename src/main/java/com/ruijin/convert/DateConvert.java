package com.ruijin.convert;

import org.apache.poi.ss.usermodel.Cell;
import org.joda.time.DateTime;

import java.util.List;

public class DateConvert implements Convert {


  public Object converTo(List<Cell> cells, String defaultValue) {
    if (cells.size() != 1) {
      return new DateTime(defaultValue);
    }
    Cell cell = cells.get(0);
    if (cell != null) {
      if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
        return this.converTo(cell.getDateCellValue());
      }
    }
    return new DateTime(defaultValue);
  }


  public DateTime converTo(Object rawValue) {
    return new DateTime(rawValue);
  }
}
