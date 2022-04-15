// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.securityhub;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StandardsControlArgs extends io.pulumi.resources.ResourceArgs {

    public static final StandardsControlArgs Empty = new StandardsControlArgs();

    /**
     * The control status could be `ENABLED` or `DISABLED`. You have to specify `disabled_reason` argument for `DISABLED` control status.
     * 
     */
    @Import(name="controlStatus", required=true)
      private final Output<String> controlStatus;

    public Output<String> controlStatus() {
        return this.controlStatus;
    }

    /**
     * A description of the reason why you are disabling a security standard control. If you specify this attribute, `control_status` will be set to `DISABLED` automatically.
     * 
     */
    @Import(name="disabledReason")
      private final @Nullable Output<String> disabledReason;

    public Output<String> disabledReason() {
        return this.disabledReason == null ? Codegen.empty() : this.disabledReason;
    }

    /**
     * The standards control ARN.
     * 
     */
    @Import(name="standardsControlArn", required=true)
      private final Output<String> standardsControlArn;

    public Output<String> standardsControlArn() {
        return this.standardsControlArn;
    }

    public StandardsControlArgs(
        Output<String> controlStatus,
        @Nullable Output<String> disabledReason,
        Output<String> standardsControlArn) {
        this.controlStatus = Objects.requireNonNull(controlStatus, "expected parameter 'controlStatus' to be non-null");
        this.disabledReason = disabledReason;
        this.standardsControlArn = Objects.requireNonNull(standardsControlArn, "expected parameter 'standardsControlArn' to be non-null");
    }

    private StandardsControlArgs() {
        this.controlStatus = Codegen.empty();
        this.disabledReason = Codegen.empty();
        this.standardsControlArn = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StandardsControlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> controlStatus;
        private @Nullable Output<String> disabledReason;
        private Output<String> standardsControlArn;

        public Builder() {
    	      // Empty
        }

        public Builder(StandardsControlArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.controlStatus = defaults.controlStatus;
    	      this.disabledReason = defaults.disabledReason;
    	      this.standardsControlArn = defaults.standardsControlArn;
        }

        public Builder controlStatus(Output<String> controlStatus) {
            this.controlStatus = Objects.requireNonNull(controlStatus);
            return this;
        }
        public Builder controlStatus(String controlStatus) {
            this.controlStatus = Output.of(Objects.requireNonNull(controlStatus));
            return this;
        }
        public Builder disabledReason(@Nullable Output<String> disabledReason) {
            this.disabledReason = disabledReason;
            return this;
        }
        public Builder disabledReason(@Nullable String disabledReason) {
            this.disabledReason = Codegen.ofNullable(disabledReason);
            return this;
        }
        public Builder standardsControlArn(Output<String> standardsControlArn) {
            this.standardsControlArn = Objects.requireNonNull(standardsControlArn);
            return this;
        }
        public Builder standardsControlArn(String standardsControlArn) {
            this.standardsControlArn = Output.of(Objects.requireNonNull(standardsControlArn));
            return this;
        }        public StandardsControlArgs build() {
            return new StandardsControlArgs(controlStatus, disabledReason, standardsControlArn);
        }
    }
}
