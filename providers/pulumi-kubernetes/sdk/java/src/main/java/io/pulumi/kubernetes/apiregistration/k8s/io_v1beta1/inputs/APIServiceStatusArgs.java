// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apiregistration.k8s.io_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.kubernetes.apiregistration.k8s.io_v1beta1.inputs.APIServiceConditionArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * APIServiceStatus contains derived information about an API server
 * 
 */
public final class APIServiceStatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final APIServiceStatusArgs Empty = new APIServiceStatusArgs();

    /**
     * Current service state of apiService.
     * 
     */
    @InputImport(name="conditions")
    private final @Nullable Input<List<APIServiceConditionArgs>> conditions;

    public Input<List<APIServiceConditionArgs>> getConditions() {
        return this.conditions == null ? Input.empty() : this.conditions;
    }

    public APIServiceStatusArgs(@Nullable Input<List<APIServiceConditionArgs>> conditions) {
        this.conditions = conditions;
    }

    private APIServiceStatusArgs() {
        this.conditions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(APIServiceStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<APIServiceConditionArgs>> conditions;

        public Builder() {
    	      // Empty
        }

        public Builder(APIServiceStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditions = defaults.conditions;
        }

        public Builder setConditions(@Nullable Input<List<APIServiceConditionArgs>> conditions) {
            this.conditions = conditions;
            return this;
        }

        public Builder setConditions(@Nullable List<APIServiceConditionArgs> conditions) {
            this.conditions = Input.ofNullable(conditions);
            return this;
        }

        public APIServiceStatusArgs build() {
            return new APIServiceStatusArgs(conditions);
        }
    }
}
