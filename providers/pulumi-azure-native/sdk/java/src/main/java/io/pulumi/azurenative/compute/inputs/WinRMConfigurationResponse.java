// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.WinRMListenerResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes Windows Remote Management configuration of the VM
 * 
 */
public final class WinRMConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final WinRMConfigurationResponse Empty = new WinRMConfigurationResponse();

    /**
     * The list of Windows Remote Management listeners
     * 
     */
    @InputImport(name="listeners")
    private final @Nullable List<WinRMListenerResponse> listeners;

    public List<WinRMListenerResponse> getListeners() {
        return this.listeners == null ? List.of() : this.listeners;
    }

    public WinRMConfigurationResponse(@Nullable List<WinRMListenerResponse> listeners) {
        this.listeners = listeners;
    }

    private WinRMConfigurationResponse() {
        this.listeners = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WinRMConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<WinRMListenerResponse> listeners;

        public Builder() {
    	      // Empty
        }

        public Builder(WinRMConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.listeners = defaults.listeners;
        }

        public Builder setListeners(@Nullable List<WinRMListenerResponse> listeners) {
            this.listeners = listeners;
            return this;
        }

        public WinRMConfigurationResponse build() {
            return new WinRMConfigurationResponse(listeners);
        }
    }
}
