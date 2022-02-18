// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.azurenative.apimanagement.inputs.HttpMessageDiagnosticArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Diagnostic settings for incoming/outgoing HTTP messages to the Gateway.
 * 
 */
public final class PipelineDiagnosticSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final PipelineDiagnosticSettingsArgs Empty = new PipelineDiagnosticSettingsArgs();

    /**
     * Diagnostic settings for request.
     * 
     */
    @InputImport(name="request")
    private final @Nullable Input<HttpMessageDiagnosticArgs> request;

    public Input<HttpMessageDiagnosticArgs> getRequest() {
        return this.request == null ? Input.empty() : this.request;
    }

    /**
     * Diagnostic settings for response.
     * 
     */
    @InputImport(name="response")
    private final @Nullable Input<HttpMessageDiagnosticArgs> response;

    public Input<HttpMessageDiagnosticArgs> getResponse() {
        return this.response == null ? Input.empty() : this.response;
    }

    public PipelineDiagnosticSettingsArgs(
        @Nullable Input<HttpMessageDiagnosticArgs> request,
        @Nullable Input<HttpMessageDiagnosticArgs> response) {
        this.request = request;
        this.response = response;
    }

    private PipelineDiagnosticSettingsArgs() {
        this.request = Input.empty();
        this.response = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineDiagnosticSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<HttpMessageDiagnosticArgs> request;
        private @Nullable Input<HttpMessageDiagnosticArgs> response;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineDiagnosticSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.request = defaults.request;
    	      this.response = defaults.response;
        }

        public Builder setRequest(@Nullable Input<HttpMessageDiagnosticArgs> request) {
            this.request = request;
            return this;
        }

        public Builder setRequest(@Nullable HttpMessageDiagnosticArgs request) {
            this.request = Input.ofNullable(request);
            return this;
        }

        public Builder setResponse(@Nullable Input<HttpMessageDiagnosticArgs> response) {
            this.response = response;
            return this;
        }

        public Builder setResponse(@Nullable HttpMessageDiagnosticArgs response) {
            this.response = Input.ofNullable(response);
            return this;
        }

        public PipelineDiagnosticSettingsArgs build() {
            return new PipelineDiagnosticSettingsArgs(request, response);
        }
    }
}
