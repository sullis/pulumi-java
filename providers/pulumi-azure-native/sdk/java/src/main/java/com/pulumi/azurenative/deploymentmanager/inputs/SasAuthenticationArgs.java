// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.deploymentmanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Defines the properties to access the artifacts using an Azure Storage SAS URI.
 * 
 */
public final class SasAuthenticationArgs extends com.pulumi.resources.ResourceArgs {

    public static final SasAuthenticationArgs Empty = new SasAuthenticationArgs();

    /**
     * The SAS URI to the Azure Storage blob container. Any offset from the root of the container to where the artifacts are located can be defined in the artifactRoot.
     * 
     */
    @Import(name="sasUri", required=true)
    private Output<String> sasUri;

    /**
     * @return The SAS URI to the Azure Storage blob container. Any offset from the root of the container to where the artifacts are located can be defined in the artifactRoot.
     * 
     */
    public Output<String> sasUri() {
        return this.sasUri;
    }

    /**
     * The authentication type
     * Expected value is &#39;Sas&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The authentication type
     * Expected value is &#39;Sas&#39;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private SasAuthenticationArgs() {}

    private SasAuthenticationArgs(SasAuthenticationArgs $) {
        this.sasUri = $.sasUri;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SasAuthenticationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SasAuthenticationArgs $;

        public Builder() {
            $ = new SasAuthenticationArgs();
        }

        public Builder(SasAuthenticationArgs defaults) {
            $ = new SasAuthenticationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param sasUri The SAS URI to the Azure Storage blob container. Any offset from the root of the container to where the artifacts are located can be defined in the artifactRoot.
         * 
         * @return builder
         * 
         */
        public Builder sasUri(Output<String> sasUri) {
            $.sasUri = sasUri;
            return this;
        }

        /**
         * @param sasUri The SAS URI to the Azure Storage blob container. Any offset from the root of the container to where the artifacts are located can be defined in the artifactRoot.
         * 
         * @return builder
         * 
         */
        public Builder sasUri(String sasUri) {
            return sasUri(Output.of(sasUri));
        }

        /**
         * @param type The authentication type
         * Expected value is &#39;Sas&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The authentication type
         * Expected value is &#39;Sas&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public SasAuthenticationArgs build() {
            $.sasUri = Objects.requireNonNull($.sasUri, "expected parameter 'sasUri' to be non-null");
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
