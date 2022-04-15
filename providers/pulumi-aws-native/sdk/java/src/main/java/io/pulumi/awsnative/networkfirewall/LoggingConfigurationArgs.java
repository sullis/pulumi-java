// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LoggingConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final LoggingConfigurationArgs Empty = new LoggingConfigurationArgs();

    @Import(name="firewallArn", required=true)
      private final Output<String> firewallArn;

    public Output<String> firewallArn() {
        return this.firewallArn;
    }

    @Import(name="firewallName")
      private final @Nullable Output<String> firewallName;

    public Output<String> firewallName() {
        return this.firewallName == null ? Codegen.empty() : this.firewallName;
    }

    @Import(name="loggingConfiguration", required=true)
      private final Output<io.pulumi.awsnative.networkfirewall.inputs.LoggingConfigurationArgs> loggingConfiguration;

    public Output<io.pulumi.awsnative.networkfirewall.inputs.LoggingConfigurationArgs> loggingConfiguration() {
        return this.loggingConfiguration;
    }

    public LoggingConfigurationArgs(
        Output<String> firewallArn,
        @Nullable Output<String> firewallName,
        Output<io.pulumi.awsnative.networkfirewall.inputs.LoggingConfigurationArgs> loggingConfiguration) {
        this.firewallArn = Objects.requireNonNull(firewallArn, "expected parameter 'firewallArn' to be non-null");
        this.firewallName = firewallName;
        this.loggingConfiguration = Objects.requireNonNull(loggingConfiguration, "expected parameter 'loggingConfiguration' to be non-null");
    }

    private LoggingConfigurationArgs() {
        this.firewallArn = Codegen.empty();
        this.firewallName = Codegen.empty();
        this.loggingConfiguration = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoggingConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> firewallArn;
        private @Nullable Output<String> firewallName;
        private Output<io.pulumi.awsnative.networkfirewall.inputs.LoggingConfigurationArgs> loggingConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(LoggingConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.firewallArn = defaults.firewallArn;
    	      this.firewallName = defaults.firewallName;
    	      this.loggingConfiguration = defaults.loggingConfiguration;
        }

        public Builder firewallArn(Output<String> firewallArn) {
            this.firewallArn = Objects.requireNonNull(firewallArn);
            return this;
        }
        public Builder firewallArn(String firewallArn) {
            this.firewallArn = Output.of(Objects.requireNonNull(firewallArn));
            return this;
        }
        public Builder firewallName(@Nullable Output<String> firewallName) {
            this.firewallName = firewallName;
            return this;
        }
        public Builder firewallName(@Nullable String firewallName) {
            this.firewallName = Codegen.ofNullable(firewallName);
            return this;
        }
        public Builder loggingConfiguration(Output<io.pulumi.awsnative.networkfirewall.inputs.LoggingConfigurationArgs> loggingConfiguration) {
            this.loggingConfiguration = Objects.requireNonNull(loggingConfiguration);
            return this;
        }
        public Builder loggingConfiguration(io.pulumi.awsnative.networkfirewall.inputs.LoggingConfigurationArgs loggingConfiguration) {
            this.loggingConfiguration = Output.of(Objects.requireNonNull(loggingConfiguration));
            return this;
        }        public LoggingConfigurationArgs build() {
            return new LoggingConfigurationArgs(firewallArn, firewallName, loggingConfiguration);
        }
    }
}
