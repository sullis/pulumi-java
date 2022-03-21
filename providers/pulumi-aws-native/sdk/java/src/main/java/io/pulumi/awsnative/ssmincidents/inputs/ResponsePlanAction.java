// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ssmincidents.inputs;

import io.pulumi.awsnative.ssmincidents.inputs.ResponsePlanSsmAutomation;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The automation configuration to launch.
 * 
 */
public final class ResponsePlanAction extends io.pulumi.resources.InvokeArgs {

    public static final ResponsePlanAction Empty = new ResponsePlanAction();

    @Import(name="ssmAutomation")
      private final @Nullable ResponsePlanSsmAutomation ssmAutomation;

    public Optional<ResponsePlanSsmAutomation> getSsmAutomation() {
        return this.ssmAutomation == null ? Optional.empty() : Optional.ofNullable(this.ssmAutomation);
    }

    public ResponsePlanAction(@Nullable ResponsePlanSsmAutomation ssmAutomation) {
        this.ssmAutomation = ssmAutomation;
    }

    private ResponsePlanAction() {
        this.ssmAutomation = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponsePlanAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ResponsePlanSsmAutomation ssmAutomation;

        public Builder() {
    	      // Empty
        }

        public Builder(ResponsePlanAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ssmAutomation = defaults.ssmAutomation;
        }

        public Builder ssmAutomation(@Nullable ResponsePlanSsmAutomation ssmAutomation) {
            this.ssmAutomation = ssmAutomation;
            return this;
        }        public ResponsePlanAction build() {
            return new ResponsePlanAction(ssmAutomation);
        }
    }
}
