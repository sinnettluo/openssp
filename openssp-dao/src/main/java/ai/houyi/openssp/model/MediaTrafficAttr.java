package ai.houyi.openssp.model;

import java.util.ArrayList;
import java.util.Arrays;

public class MediaTrafficAttr {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column media_traffic_attr.id
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column media_traffic_attr.media_id
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    private Integer mediaId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column media_traffic_attr.traffic_attr_id
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    private Integer trafficAttrId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column media_traffic_attr.enum_values
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    private String enumValues;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column media_traffic_attr.id
     *
     * @return the value of media_traffic_attr.id
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column media_traffic_attr.id
     *
     * @param id the value for media_traffic_attr.id
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column media_traffic_attr.media_id
     *
     * @return the value of media_traffic_attr.media_id
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    public Integer getMediaId() {
        return mediaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column media_traffic_attr.media_id
     *
     * @param mediaId the value for media_traffic_attr.media_id
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    public void setMediaId(Integer mediaId) {
        this.mediaId = mediaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column media_traffic_attr.traffic_attr_id
     *
     * @return the value of media_traffic_attr.traffic_attr_id
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    public Integer getTrafficAttrId() {
        return trafficAttrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column media_traffic_attr.traffic_attr_id
     *
     * @param trafficAttrId the value for media_traffic_attr.traffic_attr_id
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    public void setTrafficAttrId(Integer trafficAttrId) {
        this.trafficAttrId = trafficAttrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column media_traffic_attr.enum_values
     *
     * @return the value of media_traffic_attr.enum_values
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    public String getEnumValues() {
        return enumValues;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column media_traffic_attr.enum_values
     *
     * @param enumValues the value for media_traffic_attr.enum_values
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    public void setEnumValues(String enumValues) {
        this.enumValues = enumValues == null ? null : enumValues.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table media_traffic_attr
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public static MediaTrafficAttr.Builder builder() {
        return new MediaTrafficAttr.Builder();
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table media_traffic_attr
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public static class Builder {
        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table media_traffic_attr
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private MediaTrafficAttr obj;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table media_traffic_attr
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder() {
            this.obj = new MediaTrafficAttr();
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column media_traffic_attr.id
         *
         * @param id the value for media_traffic_attr.id
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder id(Integer id) {
            obj.setId(id);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column media_traffic_attr.media_id
         *
         * @param mediaId the value for media_traffic_attr.media_id
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder mediaId(Integer mediaId) {
            obj.setMediaId(mediaId);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column media_traffic_attr.traffic_attr_id
         *
         * @param trafficAttrId the value for media_traffic_attr.traffic_attr_id
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder trafficAttrId(Integer trafficAttrId) {
            obj.setTrafficAttrId(trafficAttrId);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column media_traffic_attr.enum_values
         *
         * @param enumValues the value for media_traffic_attr.enum_values
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder enumValues(String enumValues) {
            obj.setEnumValues(enumValues);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table media_traffic_attr
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public MediaTrafficAttr build() {
            return this.obj;
        }
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table media_traffic_attr
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        mediaId("media_id", "mediaId", "INTEGER", false),
        trafficAttrId("traffic_attr_id", "trafficAttrId", "INTEGER", false),
        enumValues("enum_values", "enumValues", "VARCHAR", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table media_traffic_attr
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private static final String BEGINNING_DELIMITER = "\"";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table media_traffic_attr
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private static final String ENDING_DELIMITER = "\"";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table media_traffic_attr
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table media_traffic_attr
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table media_traffic_attr
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table media_traffic_attr
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table media_traffic_attr
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table media_traffic_attr
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table media_traffic_attr
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table media_traffic_attr
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table media_traffic_attr
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table media_traffic_attr
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table media_traffic_attr
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table media_traffic_attr
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public static Column[] excludes(Column ... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table media_traffic_attr
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getEscapedColumnName() {
            if (this.isColumnNameDelimited) {
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
            } else {
                return this.column;
            }
        }
    }
}