// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.portal.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class DashboardPartsResponsePosition {
    /**
     * @return The dashboard&#39;s part column span.
     * 
     */
    private final Integer colSpan;
    /**
     * @return The dashboard part&#39;s metadata.
     * 
     */
    private final @Nullable Map<String,Object> metadata;
    /**
     * @return The dashboard&#39;s part row span.
     * 
     */
    private final Integer rowSpan;
    /**
     * @return The dashboard&#39;s part x coordinate.
     * 
     */
    private final Integer x;
    /**
     * @return The dashboard&#39;s part y coordinate.
     * 
     */
    private final Integer y;

    @CustomType.Constructor
    private DashboardPartsResponsePosition(
        @CustomType.Parameter("colSpan") Integer colSpan,
        @CustomType.Parameter("metadata") @Nullable Map<String,Object> metadata,
        @CustomType.Parameter("rowSpan") Integer rowSpan,
        @CustomType.Parameter("x") Integer x,
        @CustomType.Parameter("y") Integer y) {
        this.colSpan = colSpan;
        this.metadata = metadata;
        this.rowSpan = rowSpan;
        this.x = x;
        this.y = y;
    }

    /**
     * @return The dashboard&#39;s part column span.
     * 
     */
    public Integer colSpan() {
        return this.colSpan;
    }
    /**
     * @return The dashboard part&#39;s metadata.
     * 
     */
    public Map<String,Object> metadata() {
        return this.metadata == null ? Map.of() : this.metadata;
    }
    /**
     * @return The dashboard&#39;s part row span.
     * 
     */
    public Integer rowSpan() {
        return this.rowSpan;
    }
    /**
     * @return The dashboard&#39;s part x coordinate.
     * 
     */
    public Integer x() {
        return this.x;
    }
    /**
     * @return The dashboard&#39;s part y coordinate.
     * 
     */
    public Integer y() {
        return this.y;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardPartsResponsePosition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer colSpan;
        private @Nullable Map<String,Object> metadata;
        private Integer rowSpan;
        private Integer x;
        private Integer y;

        public Builder() {
    	      // Empty
        }

        public Builder(DashboardPartsResponsePosition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.colSpan = defaults.colSpan;
    	      this.metadata = defaults.metadata;
    	      this.rowSpan = defaults.rowSpan;
    	      this.x = defaults.x;
    	      this.y = defaults.y;
        }

        public Builder colSpan(Integer colSpan) {
            this.colSpan = Objects.requireNonNull(colSpan);
            return this;
        }
        public Builder metadata(@Nullable Map<String,Object> metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder rowSpan(Integer rowSpan) {
            this.rowSpan = Objects.requireNonNull(rowSpan);
            return this;
        }
        public Builder x(Integer x) {
            this.x = Objects.requireNonNull(x);
            return this;
        }
        public Builder y(Integer y) {
            this.y = Objects.requireNonNull(y);
            return this;
        }        public DashboardPartsResponsePosition build() {
            return new DashboardPartsResponsePosition(colSpan, metadata, rowSpan, x, y);
        }
    }
}
