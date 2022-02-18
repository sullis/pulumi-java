// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Boot Diagnostics is a debugging feature which allows you to view Console Output and Screenshot to diagnose VM status. <br><br> You can easily view the output of your console log. <br><br> Azure also enables you to see a screenshot of the VM from the hypervisor.
 * 
 */
public final class BootDiagnosticsArgs extends io.pulumi.resources.ResourceArgs {

    public static final BootDiagnosticsArgs Empty = new BootDiagnosticsArgs();

    /**
     * Whether boot diagnostics should be enabled on the Virtual Machine.
     * 
     */
    @InputImport(name="enabled")
    private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    /**
     * Uri of the storage account to use for placing the console output and screenshot. <br><br>If storageUri is not specified while enabling boot diagnostics, managed storage will be used.
     * 
     */
    @InputImport(name="storageUri")
    private final @Nullable Input<String> storageUri;

    public Input<String> getStorageUri() {
        return this.storageUri == null ? Input.empty() : this.storageUri;
    }

    public BootDiagnosticsArgs(
        @Nullable Input<Boolean> enabled,
        @Nullable Input<String> storageUri) {
        this.enabled = enabled;
        this.storageUri = storageUri;
    }

    private BootDiagnosticsArgs() {
        this.enabled = Input.empty();
        this.storageUri = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BootDiagnosticsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<String> storageUri;

        public Builder() {
    	      // Empty
        }

        public Builder(BootDiagnosticsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.storageUri = defaults.storageUri;
        }

        public Builder setEnabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder setStorageUri(@Nullable Input<String> storageUri) {
            this.storageUri = storageUri;
            return this;
        }

        public Builder setStorageUri(@Nullable String storageUri) {
            this.storageUri = Input.ofNullable(storageUri);
            return this;
        }

        public BootDiagnosticsArgs build() {
            return new BootDiagnosticsArgs(enabled, storageUri);
        }
    }
}
