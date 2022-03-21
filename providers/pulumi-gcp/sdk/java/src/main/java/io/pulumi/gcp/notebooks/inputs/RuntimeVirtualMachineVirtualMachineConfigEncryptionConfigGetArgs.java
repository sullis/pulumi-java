// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.notebooks.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuntimeVirtualMachineVirtualMachineConfigEncryptionConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuntimeVirtualMachineVirtualMachineConfigEncryptionConfigGetArgs Empty = new RuntimeVirtualMachineVirtualMachineConfigEncryptionConfigGetArgs();

    /**
     * The Cloud KMS resource identifier of the customer-managed
     * encryption key used to protect a resource, such as a disks.
     * It has the following format:
     * `projects/{PROJECT_ID}/locations/{REGION}/keyRings/
     * {KEY_RING_NAME}/cryptoKeys/{KEY_NAME}`
     * 
     */
    @Import(name="kmsKey")
      private final @Nullable Output<String> kmsKey;

    public Output<String> getKmsKey() {
        return this.kmsKey == null ? Output.empty() : this.kmsKey;
    }

    public RuntimeVirtualMachineVirtualMachineConfigEncryptionConfigGetArgs(@Nullable Output<String> kmsKey) {
        this.kmsKey = kmsKey;
    }

    private RuntimeVirtualMachineVirtualMachineConfigEncryptionConfigGetArgs() {
        this.kmsKey = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuntimeVirtualMachineVirtualMachineConfigEncryptionConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> kmsKey;

        public Builder() {
    	      // Empty
        }

        public Builder(RuntimeVirtualMachineVirtualMachineConfigEncryptionConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKey = defaults.kmsKey;
        }

        public Builder kmsKey(@Nullable Output<String> kmsKey) {
            this.kmsKey = kmsKey;
            return this;
        }
        public Builder kmsKey(@Nullable String kmsKey) {
            this.kmsKey = Output.ofNullable(kmsKey);
            return this;
        }        public RuntimeVirtualMachineVirtualMachineConfigEncryptionConfigGetArgs build() {
            return new RuntimeVirtualMachineVirtualMachineConfigEncryptionConfigGetArgs(kmsKey);
        }
    }
}
