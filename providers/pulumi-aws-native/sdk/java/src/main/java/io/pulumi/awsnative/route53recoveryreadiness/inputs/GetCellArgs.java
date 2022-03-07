// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53recoveryreadiness.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetCellArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetCellArgs Empty = new GetCellArgs();

    /**
     * The name of the cell to create.
     * 
     */
    @InputImport(name="cellName", required=true)
      private final String cellName;

    public String getCellName() {
        return this.cellName;
    }

    public GetCellArgs(String cellName) {
        this.cellName = Objects.requireNonNull(cellName, "expected parameter 'cellName' to be non-null");
    }

    private GetCellArgs() {
        this.cellName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCellArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cellName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCellArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cellName = defaults.cellName;
        }

        public Builder setCellName(String cellName) {
            this.cellName = Objects.requireNonNull(cellName);
            return this;
        }
        public GetCellArgs build() {
            return new GetCellArgs(cellName);
        }
    }
}