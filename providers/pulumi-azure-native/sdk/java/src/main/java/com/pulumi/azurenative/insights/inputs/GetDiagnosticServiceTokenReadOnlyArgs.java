// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDiagnosticServiceTokenReadOnlyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDiagnosticServiceTokenReadOnlyArgs Empty = new GetDiagnosticServiceTokenReadOnlyArgs();

    /**
     * The identifier of the resource.
     * 
     */
    @Import(name="resourceUri", required=true)
    private Output<String> resourceUri;

    /**
     * @return The identifier of the resource.
     * 
     */
    public Output<String> resourceUri() {
        return this.resourceUri;
    }

    private GetDiagnosticServiceTokenReadOnlyArgs() {}

    private GetDiagnosticServiceTokenReadOnlyArgs(GetDiagnosticServiceTokenReadOnlyArgs $) {
        this.resourceUri = $.resourceUri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDiagnosticServiceTokenReadOnlyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDiagnosticServiceTokenReadOnlyArgs $;

        public Builder() {
            $ = new GetDiagnosticServiceTokenReadOnlyArgs();
        }

        public Builder(GetDiagnosticServiceTokenReadOnlyArgs defaults) {
            $ = new GetDiagnosticServiceTokenReadOnlyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceUri The identifier of the resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceUri(Output<String> resourceUri) {
            $.resourceUri = resourceUri;
            return this;
        }

        /**
         * @param resourceUri The identifier of the resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceUri(String resourceUri) {
            return resourceUri(Output.of(resourceUri));
        }

        public GetDiagnosticServiceTokenReadOnlyArgs build() {
            $.resourceUri = Objects.requireNonNull($.resourceUri, "expected parameter 'resourceUri' to be non-null");
            return $;
        }
    }

}
