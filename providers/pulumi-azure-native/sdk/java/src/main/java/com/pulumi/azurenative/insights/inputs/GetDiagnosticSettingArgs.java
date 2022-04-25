// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDiagnosticSettingArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDiagnosticSettingArgs Empty = new GetDiagnosticSettingArgs();

    /**
     * The name of the diagnostic setting.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the diagnostic setting.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The identifier of the resource.
     * 
     */
    @Import(name="resourceUri", required=true)
    private String resourceUri;

    /**
     * @return The identifier of the resource.
     * 
     */
    public String resourceUri() {
        return this.resourceUri;
    }

    private GetDiagnosticSettingArgs() {}

    private GetDiagnosticSettingArgs(GetDiagnosticSettingArgs $) {
        this.name = $.name;
        this.resourceUri = $.resourceUri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDiagnosticSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDiagnosticSettingArgs $;

        public Builder() {
            $ = new GetDiagnosticSettingArgs();
        }

        public Builder(GetDiagnosticSettingArgs defaults) {
            $ = new GetDiagnosticSettingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the diagnostic setting.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param resourceUri The identifier of the resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceUri(String resourceUri) {
            $.resourceUri = resourceUri;
            return this;
        }

        public GetDiagnosticSettingArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceUri = Objects.requireNonNull($.resourceUri, "expected parameter 'resourceUri' to be non-null");
            return $;
        }
    }

}
