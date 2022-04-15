// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.mq.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BrokerLogsArgs extends io.pulumi.resources.ResourceArgs {

    public static final BrokerLogsArgs Empty = new BrokerLogsArgs();

    /**
     * Enables audit logging. Auditing is only possible for `engine_type` of `ActiveMQ`. User management action made using JMX or the ActiveMQ Web Console is logged. Defaults to `false`.
     * 
     */
    @Import(name="audit")
      private final @Nullable Output<Boolean> audit;

    public Output<Boolean> audit() {
        return this.audit == null ? Codegen.empty() : this.audit;
    }

    /**
     * Enables general logging via CloudWatch. Defaults to `false`.
     * 
     */
    @Import(name="general")
      private final @Nullable Output<Boolean> general;

    public Output<Boolean> general() {
        return this.general == null ? Codegen.empty() : this.general;
    }

    public BrokerLogsArgs(
        @Nullable Output<Boolean> audit,
        @Nullable Output<Boolean> general) {
        this.audit = audit;
        this.general = general;
    }

    private BrokerLogsArgs() {
        this.audit = Codegen.empty();
        this.general = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BrokerLogsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> audit;
        private @Nullable Output<Boolean> general;

        public Builder() {
    	      // Empty
        }

        public Builder(BrokerLogsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audit = defaults.audit;
    	      this.general = defaults.general;
        }

        public Builder audit(@Nullable Output<Boolean> audit) {
            this.audit = audit;
            return this;
        }
        public Builder audit(@Nullable Boolean audit) {
            this.audit = Codegen.ofNullable(audit);
            return this;
        }
        public Builder general(@Nullable Output<Boolean> general) {
            this.general = general;
            return this;
        }
        public Builder general(@Nullable Boolean general) {
            this.general = Codegen.ofNullable(general);
            return this;
        }        public BrokerLogsArgs build() {
            return new BrokerLogsArgs(audit, general);
        }
    }
}
