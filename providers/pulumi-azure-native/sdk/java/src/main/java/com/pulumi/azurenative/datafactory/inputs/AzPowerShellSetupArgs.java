// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * The express custom setup of installing Azure PowerShell.
 * 
 */
public final class AzPowerShellSetupArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzPowerShellSetupArgs Empty = new AzPowerShellSetupArgs();

    /**
     * The type of custom setup.
     * Expected value is 'AzPowerShellSetup'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    /**
     * The required version of Azure PowerShell to install.
     * 
     */
    @Import(name="version", required=true)
      private final Output<String> version;

    public Output<String> version() {
        return this.version;
    }

    public AzPowerShellSetupArgs(
        Output<String> type,
        Output<String> version) {
        this.type = Codegen.stringProp("type").output().arg(type).require();
        this.version = Objects.requireNonNull(version, "expected parameter 'version' to be non-null");
    }

    private AzPowerShellSetupArgs() {
        this.type = Codegen.empty();
        this.version = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzPowerShellSetupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> type;
        private Output<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(AzPowerShellSetupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.version = defaults.version;
        }

        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public Builder version(Output<String> version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public Builder version(String version) {
            this.version = Output.of(Objects.requireNonNull(version));
            return this;
        }        public AzPowerShellSetupArgs build() {
            return new AzPowerShellSetupArgs(type, version);
        }
    }
}
