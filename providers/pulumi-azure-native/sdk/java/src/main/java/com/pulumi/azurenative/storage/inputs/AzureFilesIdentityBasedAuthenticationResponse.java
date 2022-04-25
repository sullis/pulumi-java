// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.inputs;

import com.pulumi.azurenative.storage.inputs.ActiveDirectoryPropertiesResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Settings for Azure Files identity based authentication.
 * 
 */
public final class AzureFilesIdentityBasedAuthenticationResponse extends com.pulumi.resources.InvokeArgs {

    public static final AzureFilesIdentityBasedAuthenticationResponse Empty = new AzureFilesIdentityBasedAuthenticationResponse();

    /**
     * Required if choose AD.
     * 
     */
    @Import(name="activeDirectoryProperties")
    private @Nullable ActiveDirectoryPropertiesResponse activeDirectoryProperties;

    /**
     * @return Required if choose AD.
     * 
     */
    public Optional<ActiveDirectoryPropertiesResponse> activeDirectoryProperties() {
        return Optional.ofNullable(this.activeDirectoryProperties);
    }

    /**
     * Indicates the directory service used.
     * 
     */
    @Import(name="directoryServiceOptions", required=true)
    private String directoryServiceOptions;

    /**
     * @return Indicates the directory service used.
     * 
     */
    public String directoryServiceOptions() {
        return this.directoryServiceOptions;
    }

    private AzureFilesIdentityBasedAuthenticationResponse() {}

    private AzureFilesIdentityBasedAuthenticationResponse(AzureFilesIdentityBasedAuthenticationResponse $) {
        this.activeDirectoryProperties = $.activeDirectoryProperties;
        this.directoryServiceOptions = $.directoryServiceOptions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureFilesIdentityBasedAuthenticationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureFilesIdentityBasedAuthenticationResponse $;

        public Builder() {
            $ = new AzureFilesIdentityBasedAuthenticationResponse();
        }

        public Builder(AzureFilesIdentityBasedAuthenticationResponse defaults) {
            $ = new AzureFilesIdentityBasedAuthenticationResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param activeDirectoryProperties Required if choose AD.
         * 
         * @return builder
         * 
         */
        public Builder activeDirectoryProperties(@Nullable ActiveDirectoryPropertiesResponse activeDirectoryProperties) {
            $.activeDirectoryProperties = activeDirectoryProperties;
            return this;
        }

        /**
         * @param directoryServiceOptions Indicates the directory service used.
         * 
         * @return builder
         * 
         */
        public Builder directoryServiceOptions(String directoryServiceOptions) {
            $.directoryServiceOptions = directoryServiceOptions;
            return this;
        }

        public AzureFilesIdentityBasedAuthenticationResponse build() {
            $.directoryServiceOptions = Objects.requireNonNull($.directoryServiceOptions, "expected parameter 'directoryServiceOptions' to be non-null");
            return $;
        }
    }

}
