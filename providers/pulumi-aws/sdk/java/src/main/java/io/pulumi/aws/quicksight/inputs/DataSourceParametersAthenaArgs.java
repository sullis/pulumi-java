// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.quicksight.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataSourceParametersAthenaArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceParametersAthenaArgs Empty = new DataSourceParametersAthenaArgs();

    /**
     * The work-group to which to connect.
     * 
     */
    @Import(name="workGroup")
      private final @Nullable Output<String> workGroup;

    public Output<String> workGroup() {
        return this.workGroup == null ? Codegen.empty() : this.workGroup;
    }

    public DataSourceParametersAthenaArgs(@Nullable Output<String> workGroup) {
        this.workGroup = workGroup;
    }

    private DataSourceParametersAthenaArgs() {
        this.workGroup = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceParametersAthenaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> workGroup;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceParametersAthenaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.workGroup = defaults.workGroup;
        }

        public Builder workGroup(@Nullable Output<String> workGroup) {
            this.workGroup = workGroup;
            return this;
        }
        public Builder workGroup(@Nullable String workGroup) {
            this.workGroup = Codegen.ofNullable(workGroup);
            return this;
        }        public DataSourceParametersAthenaArgs build() {
            return new DataSourceParametersAthenaArgs(workGroup);
        }
    }
}
