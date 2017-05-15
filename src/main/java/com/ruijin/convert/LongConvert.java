package com.ruijin.convert;

import org.apache.poi.ss.usermodel.Cell;

import java.util.List;

/**
 * Created by tangjijun on 2017/5/15.
 */
public class LongConvert implements Convert{

  public Object converTo(List<Cell> cells, String defaultValue) {
    if (cells.size() != 1) {
      return new Long(defaultValue);
    }
    Cell cell = cells.get(0);
    if (cell != null) {
      if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
        return this.converTo(cell.getNumericCellValue());
      }
    }
    return new Long(defaultValue);
  }


  public Long converTo(Object initValue) {
    return ((Double) initValue).longValue();
  }
}
