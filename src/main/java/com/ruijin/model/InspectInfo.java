package com.ruijin.model;

import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
/**
 * 检验信息
 */
public class InspectInfo {

  public static final InspectInfo EMPTY_INSPECTINFO = new InspectInfo();

  private DateTime inspectDate;//检验时间
  private String inspectType = "";//3,4
  private String grem = "";//细菌名称
  private String position = "";//部位
  private List<Drugfast> drugfasts = new ArrayList<Drugfast>();

  public InspectInfo(DateTime inspectDate, String inspectType, String grem,
      Set<Drugfast> drugfasts,String position) {
    this.inspectDate = inspectDate;
    this.inspectType = inspectType;
    this.grem = grem;
    this.drugfasts = new ArrayList<Drugfast>(drugfasts);
    this.position = position;
  }

  public InspectInfo() {

  }

  public List<Drugfast> getDrugfasts() {
    return drugfasts;
  }

  public void addDrugfasts(Drugfast drugfast) {
    drugfasts.add(drugfast);
  }

  public DateTime getInspectDate() {
    return inspectDate;
  }

  public void setInspectDate(DateTime inspectDate) {
    this.inspectDate = inspectDate;
  }

  public String getInspectType() {
    return inspectType;
  }

  public void setInspectType(String inspectType) {
    this.inspectType = inspectType;
  }

  public String getGrem() {
    return grem;
  }

  public void setGrem(String grem) {
    this.grem = grem;
  }

  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  @Override public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;

    InspectInfo that = (InspectInfo) o;

    if (inspectDate != null ? !inspectDate.equals(that.inspectDate) : that.inspectDate != null)
      return false;
    if (inspectType != null ? !inspectType.equals(that.inspectType) : that.inspectType != null)
      return false;
    if (grem != null ? !grem.equals(that.grem) : that.grem != null)
      return false;
    return position != null ? position.equals(that.position) : that.position == null;
  }

  @Override public int hashCode() {
    int result = inspectDate != null ? inspectDate.hashCode() : 0;
    result = 31 * result + (inspectType != null ? inspectType.hashCode() : 0);
    result = 31 * result + (grem != null ? grem.hashCode() : 0);
    result = 31 * result + (position != null ? position.hashCode() : 0);
    return result;
  }

  @Override public String toString() {
    return "InspectInfo{" + "inspectDate=" + inspectDate + ", inspectType='" + inspectType + '\''
        + ", grem='" + grem + '\'' + ", position='" + position + '\'' + ", drugfasts=" + drugfasts
        + '}';
  }
}
