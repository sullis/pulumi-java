// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * <p>Amazon Athena parameters.</p>
 * 
 */
public final class DataSourceAthenaParametersArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceAthenaParametersArgs Empty = new DataSourceAthenaParametersArgs();

    /**
     * <p>The workgroup that Amazon Athena uses.</p>
     * 
     */
    @Import(name="workGroup")
      private final @Nullable Output<String> workGroup;

    public Output<String> workGroup() {
        return this.workGroup == null ? Codegen.empty() : this.workGroup;
    }

    public DataSourceAthenaParametersArgs(@Nullable Output<String> workGroup) {
        this.workGroup = workGroup;
    }

    private DataSourceAthenaParametersArgs() {
        this.workGroup = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceAthenaParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> workGroup;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceAthenaParametersArgs defaults) {
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
        }        public DataSourceAthenaParametersArgs build() {
            return new DataSourceAthenaParametersArgs(workGroup);
        }
    }
}
