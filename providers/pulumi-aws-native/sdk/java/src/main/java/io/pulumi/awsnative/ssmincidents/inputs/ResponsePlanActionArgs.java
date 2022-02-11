// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ssmincidents.inputs;

import io.pulumi.awsnative.ssmincidents.inputs.ResponsePlanSsmAutomationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResponsePlanActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResponsePlanActionArgs Empty = new ResponsePlanActionArgs();

    @InputImport(name="ssmAutomation")
    private final @Nullable Input<ResponsePlanSsmAutomationArgs> ssmAutomation;

    public Input<ResponsePlanSsmAutomationArgs> getSsmAutomation() {
        return this.ssmAutomation == null ? Input.empty() : this.ssmAutomation;
    }

    public ResponsePlanActionArgs(@Nullable Input<ResponsePlanSsmAutomationArgs> ssmAutomation) {
        this.ssmAutomation = ssmAutomation;
    }

    private ResponsePlanActionArgs() {
        this.ssmAutomation = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponsePlanActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ResponsePlanSsmAutomationArgs> ssmAutomation;

        public Builder() {
    	      // Empty
        }

        public Builder(ResponsePlanActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ssmAutomation = defaults.ssmAutomation;
        }

        public Builder setSsmAutomation(@Nullable Input<ResponsePlanSsmAutomationArgs> ssmAutomation) {
            this.ssmAutomation = ssmAutomation;
            return this;
        }

        public Builder setSsmAutomation(@Nullable ResponsePlanSsmAutomationArgs ssmAutomation) {
            this.ssmAutomation = Input.ofNullable(ssmAutomation);
            return this;
        }

        public ResponsePlanActionArgs build() {
            return new ResponsePlanActionArgs(ssmAutomation);
        }
    }
}
