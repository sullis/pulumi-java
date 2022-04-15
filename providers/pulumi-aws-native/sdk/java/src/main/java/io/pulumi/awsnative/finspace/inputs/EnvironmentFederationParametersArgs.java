// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.finspace.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Additional parameters to identify Federation mode
 * 
 */
public final class EnvironmentFederationParametersArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnvironmentFederationParametersArgs Empty = new EnvironmentFederationParametersArgs();

    /**
     * SAML metadata URL to link with the Environment
     * 
     */
    @Import(name="applicationCallBackURL")
      private final @Nullable Output<String> applicationCallBackURL;

    public Output<String> applicationCallBackURL() {
        return this.applicationCallBackURL == null ? Codegen.empty() : this.applicationCallBackURL;
    }

    /**
     * Attribute map for SAML configuration
     * 
     */
    @Import(name="attributeMap")
      private final @Nullable Output<Object> attributeMap;

    public Output<Object> attributeMap() {
        return this.attributeMap == null ? Codegen.empty() : this.attributeMap;
    }

    /**
     * Federation provider name to link with the Environment
     * 
     */
    @Import(name="federationProviderName")
      private final @Nullable Output<String> federationProviderName;

    public Output<String> federationProviderName() {
        return this.federationProviderName == null ? Codegen.empty() : this.federationProviderName;
    }

    /**
     * SAML metadata URL to link with the Environment
     * 
     */
    @Import(name="federationURN")
      private final @Nullable Output<String> federationURN;

    public Output<String> federationURN() {
        return this.federationURN == null ? Codegen.empty() : this.federationURN;
    }

    /**
     * SAML metadata document to link the federation provider to the Environment
     * 
     */
    @Import(name="samlMetadataDocument")
      private final @Nullable Output<String> samlMetadataDocument;

    public Output<String> samlMetadataDocument() {
        return this.samlMetadataDocument == null ? Codegen.empty() : this.samlMetadataDocument;
    }

    /**
     * SAML metadata URL to link with the Environment
     * 
     */
    @Import(name="samlMetadataURL")
      private final @Nullable Output<String> samlMetadataURL;

    public Output<String> samlMetadataURL() {
        return this.samlMetadataURL == null ? Codegen.empty() : this.samlMetadataURL;
    }

    public EnvironmentFederationParametersArgs(
        @Nullable Output<String> applicationCallBackURL,
        @Nullable Output<Object> attributeMap,
        @Nullable Output<String> federationProviderName,
        @Nullable Output<String> federationURN,
        @Nullable Output<String> samlMetadataDocument,
        @Nullable Output<String> samlMetadataURL) {
        this.applicationCallBackURL = applicationCallBackURL;
        this.attributeMap = attributeMap;
        this.federationProviderName = federationProviderName;
        this.federationURN = federationURN;
        this.samlMetadataDocument = samlMetadataDocument;
        this.samlMetadataURL = samlMetadataURL;
    }

    private EnvironmentFederationParametersArgs() {
        this.applicationCallBackURL = Codegen.empty();
        this.attributeMap = Codegen.empty();
        this.federationProviderName = Codegen.empty();
        this.federationURN = Codegen.empty();
        this.samlMetadataDocument = Codegen.empty();
        this.samlMetadataURL = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentFederationParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> applicationCallBackURL;
        private @Nullable Output<Object> attributeMap;
        private @Nullable Output<String> federationProviderName;
        private @Nullable Output<String> federationURN;
        private @Nullable Output<String> samlMetadataDocument;
        private @Nullable Output<String> samlMetadataURL;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentFederationParametersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationCallBackURL = defaults.applicationCallBackURL;
    	      this.attributeMap = defaults.attributeMap;
    	      this.federationProviderName = defaults.federationProviderName;
    	      this.federationURN = defaults.federationURN;
    	      this.samlMetadataDocument = defaults.samlMetadataDocument;
    	      this.samlMetadataURL = defaults.samlMetadataURL;
        }

        public Builder applicationCallBackURL(@Nullable Output<String> applicationCallBackURL) {
            this.applicationCallBackURL = applicationCallBackURL;
            return this;
        }
        public Builder applicationCallBackURL(@Nullable String applicationCallBackURL) {
            this.applicationCallBackURL = Codegen.ofNullable(applicationCallBackURL);
            return this;
        }
        public Builder attributeMap(@Nullable Output<Object> attributeMap) {
            this.attributeMap = attributeMap;
            return this;
        }
        public Builder attributeMap(@Nullable Object attributeMap) {
            this.attributeMap = Codegen.ofNullable(attributeMap);
            return this;
        }
        public Builder federationProviderName(@Nullable Output<String> federationProviderName) {
            this.federationProviderName = federationProviderName;
            return this;
        }
        public Builder federationProviderName(@Nullable String federationProviderName) {
            this.federationProviderName = Codegen.ofNullable(federationProviderName);
            return this;
        }
        public Builder federationURN(@Nullable Output<String> federationURN) {
            this.federationURN = federationURN;
            return this;
        }
        public Builder federationURN(@Nullable String federationURN) {
            this.federationURN = Codegen.ofNullable(federationURN);
            return this;
        }
        public Builder samlMetadataDocument(@Nullable Output<String> samlMetadataDocument) {
            this.samlMetadataDocument = samlMetadataDocument;
            return this;
        }
        public Builder samlMetadataDocument(@Nullable String samlMetadataDocument) {
            this.samlMetadataDocument = Codegen.ofNullable(samlMetadataDocument);
            return this;
        }
        public Builder samlMetadataURL(@Nullable Output<String> samlMetadataURL) {
            this.samlMetadataURL = samlMetadataURL;
            return this;
        }
        public Builder samlMetadataURL(@Nullable String samlMetadataURL) {
            this.samlMetadataURL = Codegen.ofNullable(samlMetadataURL);
            return this;
        }        public EnvironmentFederationParametersArgs build() {
            return new EnvironmentFederationParametersArgs(applicationCallBackURL, attributeMap, federationProviderName, federationURN, samlMetadataDocument, samlMetadataURL);
        }
    }
}
