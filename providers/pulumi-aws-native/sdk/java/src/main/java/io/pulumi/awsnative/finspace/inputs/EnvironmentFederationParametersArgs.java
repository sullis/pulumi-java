// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.finspace.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
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
    @InputImport(name="applicationCallBackURL")
      private final @Nullable Input<String> applicationCallBackURL;

    public Input<String> getApplicationCallBackURL() {
        return this.applicationCallBackURL == null ? Input.empty() : this.applicationCallBackURL;
    }

    /**
     * Attribute map for SAML configuration
     * 
     */
    @InputImport(name="attributeMap")
      private final @Nullable Input<Object> attributeMap;

    public Input<Object> getAttributeMap() {
        return this.attributeMap == null ? Input.empty() : this.attributeMap;
    }

    /**
     * Federation provider name to link with the Environment
     * 
     */
    @InputImport(name="federationProviderName")
      private final @Nullable Input<String> federationProviderName;

    public Input<String> getFederationProviderName() {
        return this.federationProviderName == null ? Input.empty() : this.federationProviderName;
    }

    /**
     * SAML metadata URL to link with the Environment
     * 
     */
    @InputImport(name="federationURN")
      private final @Nullable Input<String> federationURN;

    public Input<String> getFederationURN() {
        return this.federationURN == null ? Input.empty() : this.federationURN;
    }

    /**
     * SAML metadata document to link the federation provider to the Environment
     * 
     */
    @InputImport(name="samlMetadataDocument")
      private final @Nullable Input<String> samlMetadataDocument;

    public Input<String> getSamlMetadataDocument() {
        return this.samlMetadataDocument == null ? Input.empty() : this.samlMetadataDocument;
    }

    /**
     * SAML metadata URL to link with the Environment
     * 
     */
    @InputImport(name="samlMetadataURL")
      private final @Nullable Input<String> samlMetadataURL;

    public Input<String> getSamlMetadataURL() {
        return this.samlMetadataURL == null ? Input.empty() : this.samlMetadataURL;
    }

    public EnvironmentFederationParametersArgs(
        @Nullable Input<String> applicationCallBackURL,
        @Nullable Input<Object> attributeMap,
        @Nullable Input<String> federationProviderName,
        @Nullable Input<String> federationURN,
        @Nullable Input<String> samlMetadataDocument,
        @Nullable Input<String> samlMetadataURL) {
        this.applicationCallBackURL = applicationCallBackURL;
        this.attributeMap = attributeMap;
        this.federationProviderName = federationProviderName;
        this.federationURN = federationURN;
        this.samlMetadataDocument = samlMetadataDocument;
        this.samlMetadataURL = samlMetadataURL;
    }

    private EnvironmentFederationParametersArgs() {
        this.applicationCallBackURL = Input.empty();
        this.attributeMap = Input.empty();
        this.federationProviderName = Input.empty();
        this.federationURN = Input.empty();
        this.samlMetadataDocument = Input.empty();
        this.samlMetadataURL = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentFederationParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> applicationCallBackURL;
        private @Nullable Input<Object> attributeMap;
        private @Nullable Input<String> federationProviderName;
        private @Nullable Input<String> federationURN;
        private @Nullable Input<String> samlMetadataDocument;
        private @Nullable Input<String> samlMetadataURL;

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

        public Builder setApplicationCallBackURL(@Nullable Input<String> applicationCallBackURL) {
            this.applicationCallBackURL = applicationCallBackURL;
            return this;
        }

        public Builder setApplicationCallBackURL(@Nullable String applicationCallBackURL) {
            this.applicationCallBackURL = Input.ofNullable(applicationCallBackURL);
            return this;
        }

        public Builder setAttributeMap(@Nullable Input<Object> attributeMap) {
            this.attributeMap = attributeMap;
            return this;
        }

        public Builder setAttributeMap(@Nullable Object attributeMap) {
            this.attributeMap = Input.ofNullable(attributeMap);
            return this;
        }

        public Builder setFederationProviderName(@Nullable Input<String> federationProviderName) {
            this.federationProviderName = federationProviderName;
            return this;
        }

        public Builder setFederationProviderName(@Nullable String federationProviderName) {
            this.federationProviderName = Input.ofNullable(federationProviderName);
            return this;
        }

        public Builder setFederationURN(@Nullable Input<String> federationURN) {
            this.federationURN = federationURN;
            return this;
        }

        public Builder setFederationURN(@Nullable String federationURN) {
            this.federationURN = Input.ofNullable(federationURN);
            return this;
        }

        public Builder setSamlMetadataDocument(@Nullable Input<String> samlMetadataDocument) {
            this.samlMetadataDocument = samlMetadataDocument;
            return this;
        }

        public Builder setSamlMetadataDocument(@Nullable String samlMetadataDocument) {
            this.samlMetadataDocument = Input.ofNullable(samlMetadataDocument);
            return this;
        }

        public Builder setSamlMetadataURL(@Nullable Input<String> samlMetadataURL) {
            this.samlMetadataURL = samlMetadataURL;
            return this;
        }

        public Builder setSamlMetadataURL(@Nullable String samlMetadataURL) {
            this.samlMetadataURL = Input.ofNullable(samlMetadataURL);
            return this;
        }
        public EnvironmentFederationParametersArgs build() {
            return new EnvironmentFederationParametersArgs(applicationCallBackURL, attributeMap, federationProviderName, federationURN, samlMetadataDocument, samlMetadataURL);
        }
    }
}