package com.bjfu.entity;

public class Dept {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dept.DEPTNO
     *
     * @mbg.generated Tue Jan 05 16:22:30 CST 2021
     */
    private Integer deptno;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dept.DNAME
     *
     * @mbg.generated Tue Jan 05 16:22:30 CST 2021
     */
    private String dname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dept.LOC
     *
     * @mbg.generated Tue Jan 05 16:22:30 CST 2021
     */
    private String loc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dept.AGEE
     *
     * @mbg.generated Tue Jan 05 16:22:30 CST 2021
     */
    private Integer agee;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dept.DEPTNO
     *
     * @return the value of dept.DEPTNO
     *
     * @mbg.generated Tue Jan 05 16:22:30 CST 2021
     */
    public Integer getDeptno() {
        return deptno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dept.DEPTNO
     *
     * @param deptno the value for dept.DEPTNO
     *
     * @mbg.generated Tue Jan 05 16:22:30 CST 2021
     */
    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dept.DNAME
     *
     * @return the value of dept.DNAME
     *
     * @mbg.generated Tue Jan 05 16:22:30 CST 2021
     */
    public String getDname() {
        return dname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dept.DNAME
     *
     * @param dname the value for dept.DNAME
     *
     * @mbg.generated Tue Jan 05 16:22:30 CST 2021
     */
    public void setDname(String dname) {
        this.dname = dname == null ? null : dname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dept.LOC
     *
     * @return the value of dept.LOC
     *
     * @mbg.generated Tue Jan 05 16:22:30 CST 2021
     */
    public String getLoc() {
        return loc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dept.LOC
     *
     * @param loc the value for dept.LOC
     *
     * @mbg.generated Tue Jan 05 16:22:30 CST 2021
     */
    public void setLoc(String loc) {
        this.loc = loc == null ? null : loc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dept.AGEE
     *
     * @return the value of dept.AGEE
     *
     * @mbg.generated Tue Jan 05 16:22:30 CST 2021
     */
    public Integer getAgee() {
        return agee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dept.AGEE
     *
     * @param agee the value for dept.AGEE
     *
     * @mbg.generated Tue Jan 05 16:22:30 CST 2021
     */
    public void setAgee(Integer agee) {
        this.agee = agee;
    }
}