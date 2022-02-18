// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Status information about a virtual machine.
 * 
 */
public final class ComputeVmInstanceViewStatusResponse extends io.pulumi.resources.InvokeArgs {

    public static final ComputeVmInstanceViewStatusResponse Empty = new ComputeVmInstanceViewStatusResponse();

    /**
     * Gets the status Code.
     * 
     */
    @InputImport(name="code")
    private final @Nullable String code;

    public Optional<String> getCode() {
        return this.code == null ? Optional.empty() : Optional.ofNullable(this.code);
    }

    /**
     * Gets the short localizable label for the status.
     * 
     */
    @InputImport(name="displayStatus")
    private final @Nullable String displayStatus;

    public Optional<String> getDisplayStatus() {
        return this.displayStatus == null ? Optional.empty() : Optional.ofNullable(this.displayStatus);
    }

    /**
     * Gets the message associated with the status.
     * 
     */
    @InputImport(name="message")
    private final @Nullable String message;

    public Optional<String> getMessage() {
        return this.message == null ? Optional.empty() : Optional.ofNullable(this.message);
    }

    public ComputeVmInstanceViewStatusResponse(
        @Nullable String code,
        @Nullable String displayStatus,
        @Nullable String message) {
        this.code = code;
        this.displayStatus = displayStatus;
        this.message = message;
    }

    private ComputeVmInstanceViewStatusResponse() {
        this.code = null;
        this.displayStatus = null;
        this.message = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComputeVmInstanceViewStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String code;
        private @Nullable String displayStatus;
        private @Nullable String message;

        public Builder() {
    	      // Empty
        }

        public Builder(ComputeVmInstanceViewStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.displayStatus = defaults.displayStatus;
    	      this.message = defaults.message;
        }

        public Builder setCode(@Nullable String code) {
            this.code = code;
            return this;
        }

        public Builder setDisplayStatus(@Nullable String displayStatus) {
            this.displayStatus = displayStatus;
            return this;
        }

        public Builder setMessage(@Nullable String message) {
            this.message = message;
            return this;
        }

        public ComputeVmInstanceViewStatusResponse build() {
            return new ComputeVmInstanceViewStatusResponse(code, displayStatus, message);
        }
    }
}
