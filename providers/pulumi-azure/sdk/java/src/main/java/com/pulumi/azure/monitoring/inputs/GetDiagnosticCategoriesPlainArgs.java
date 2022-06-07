// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDiagnosticCategoriesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDiagnosticCategoriesPlainArgs Empty = new GetDiagnosticCategoriesPlainArgs();

    /**
     * The ID of an existing Resource which Monitor Diagnostics Categories should be retrieved for.
     * 
     */
    @Import(name="resourceId", required=true)
    private String resourceId;

    /**
     * @return The ID of an existing Resource which Monitor Diagnostics Categories should be retrieved for.
     * 
     */
    public String resourceId() {
        return this.resourceId;
    }

    private GetDiagnosticCategoriesPlainArgs() {}

    private GetDiagnosticCategoriesPlainArgs(GetDiagnosticCategoriesPlainArgs $) {
        this.resourceId = $.resourceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDiagnosticCategoriesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDiagnosticCategoriesPlainArgs $;

        public Builder() {
            $ = new GetDiagnosticCategoriesPlainArgs();
        }

        public Builder(GetDiagnosticCategoriesPlainArgs defaults) {
            $ = new GetDiagnosticCategoriesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceId The ID of an existing Resource which Monitor Diagnostics Categories should be retrieved for.
         * 
         * @return builder
         * 
         */
        public Builder resourceId(String resourceId) {
            $.resourceId = resourceId;
            return this;
        }

        public GetDiagnosticCategoriesPlainArgs build() {
            $.resourceId = Objects.requireNonNull($.resourceId, "expected parameter 'resourceId' to be non-null");
            return $;
        }
    }

}
