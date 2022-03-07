// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.portal.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class DashboardPartsResponsePosition {
    /**
     * The dashboard's part column span.
     * 
     */
    private final Integer colSpan;
    /**
     * The dashboard part's metadata.
     * 
     */
    private final @Nullable Map<String,Object> metadata;
    /**
     * The dashboard's part row span.
     * 
     */
    private final Integer rowSpan;
    /**
     * The dashboard's part x coordinate.
     * 
     */
    private final Integer x;
    /**
     * The dashboard's part y coordinate.
     * 
     */
    private final Integer y;

    @OutputCustomType.Constructor({"colSpan","metadata","rowSpan","x","y"})
    private DashboardPartsResponsePosition(
        Integer colSpan,
        @Nullable Map<String,Object> metadata,
        Integer rowSpan,
        Integer x,
        Integer y) {
        this.colSpan = Objects.requireNonNull(colSpan);
        this.metadata = metadata;
        this.rowSpan = Objects.requireNonNull(rowSpan);
        this.x = Objects.requireNonNull(x);
        this.y = Objects.requireNonNull(y);
    }

    /**
     * The dashboard's part column span.
     * 
    */
    public Integer getColSpan() {
        return this.colSpan;
    }
    /**
     * The dashboard part's metadata.
     * 
    */
    public Map<String,Object> getMetadata() {
        return this.metadata == null ? Map.of() : this.metadata;
    }
    /**
     * The dashboard's part row span.
     * 
    */
    public Integer getRowSpan() {
        return this.rowSpan;
    }
    /**
     * The dashboard's part x coordinate.
     * 
    */
    public Integer getX() {
        return this.x;
    }
    /**
     * The dashboard's part y coordinate.
     * 
    */
    public Integer getY() {
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

        public Builder setColSpan(Integer colSpan) {
            this.colSpan = Objects.requireNonNull(colSpan);
            return this;
        }

        public Builder setMetadata(@Nullable Map<String,Object> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setRowSpan(Integer rowSpan) {
            this.rowSpan = Objects.requireNonNull(rowSpan);
            return this;
        }

        public Builder setX(Integer x) {
            this.x = Objects.requireNonNull(x);
            return this;
        }

        public Builder setY(Integer y) {
            this.y = Objects.requireNonNull(y);
            return this;
        }
        public DashboardPartsResponsePosition build() {
            return new DashboardPartsResponsePosition(colSpan, metadata, rowSpan, x, y);
        }
    }
}