// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OrchestratedVirtualMachineScaleSetBootDiagnosticsArgs extends com.pulumi.resources.ResourceArgs {

    public static final OrchestratedVirtualMachineScaleSetBootDiagnosticsArgs Empty = new OrchestratedVirtualMachineScaleSetBootDiagnosticsArgs();

    @Import(name="storageAccountUri")
    private @Nullable Output<String> storageAccountUri;

    public Optional<Output<String>> storageAccountUri() {
        return Optional.ofNullable(this.storageAccountUri);
    }

    private OrchestratedVirtualMachineScaleSetBootDiagnosticsArgs() {}

    private OrchestratedVirtualMachineScaleSetBootDiagnosticsArgs(OrchestratedVirtualMachineScaleSetBootDiagnosticsArgs $) {
        this.storageAccountUri = $.storageAccountUri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OrchestratedVirtualMachineScaleSetBootDiagnosticsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OrchestratedVirtualMachineScaleSetBootDiagnosticsArgs $;

        public Builder() {
            $ = new OrchestratedVirtualMachineScaleSetBootDiagnosticsArgs();
        }

        public Builder(OrchestratedVirtualMachineScaleSetBootDiagnosticsArgs defaults) {
            $ = new OrchestratedVirtualMachineScaleSetBootDiagnosticsArgs(Objects.requireNonNull(defaults));
        }

        public Builder storageAccountUri(@Nullable Output<String> storageAccountUri) {
            $.storageAccountUri = storageAccountUri;
            return this;
        }

        public Builder storageAccountUri(String storageAccountUri) {
            return storageAccountUri(Output.of(storageAccountUri));
        }

        public OrchestratedVirtualMachineScaleSetBootDiagnosticsArgs build() {
            return $;
        }
    }

}
