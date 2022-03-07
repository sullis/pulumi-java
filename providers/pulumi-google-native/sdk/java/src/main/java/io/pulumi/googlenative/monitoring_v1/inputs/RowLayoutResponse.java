// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.monitoring_v1.inputs.RowResponse;
import java.util.List;
import java.util.Objects;


/**
 * A simplified layout that divides the available space into rows and arranges a set of widgets horizontally in each row.
 * 
 */
public final class RowLayoutResponse extends io.pulumi.resources.InvokeArgs {

    public static final RowLayoutResponse Empty = new RowLayoutResponse();

    /**
     * The rows of content to display.
     * 
     */
    @InputImport(name="rows", required=true)
      private final List<RowResponse> rows;

    public List<RowResponse> getRows() {
        return this.rows;
    }

    public RowLayoutResponse(List<RowResponse> rows) {
        this.rows = Objects.requireNonNull(rows, "expected parameter 'rows' to be non-null");
    }

    private RowLayoutResponse() {
        this.rows = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RowLayoutResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<RowResponse> rows;

        public Builder() {
    	      // Empty
        }

        public Builder(RowLayoutResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rows = defaults.rows;
        }

        public Builder setRows(List<RowResponse> rows) {
            this.rows = Objects.requireNonNull(rows);
            return this;
        }
        public RowLayoutResponse build() {
            return new RowLayoutResponse(rows);
        }
    }
}