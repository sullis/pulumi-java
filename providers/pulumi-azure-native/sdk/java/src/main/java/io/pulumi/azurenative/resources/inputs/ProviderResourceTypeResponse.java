// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources.inputs;

import io.pulumi.azurenative.resources.inputs.AliasResponse;
import io.pulumi.azurenative.resources.inputs.ApiProfileResponse;
import io.pulumi.azurenative.resources.inputs.ProviderExtendedLocationResponse;
import io.pulumi.azurenative.resources.inputs.ZoneMappingResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Resource type managed by the resource provider.
 * 
 */
public final class ProviderResourceTypeResponse extends io.pulumi.resources.InvokeArgs {

    public static final ProviderResourceTypeResponse Empty = new ProviderResourceTypeResponse();

    /**
     * The aliases that are supported by this resource type.
     * 
     */
    @InputImport(name="aliases")
    private final @Nullable List<AliasResponse> aliases;

    public List<AliasResponse> getAliases() {
        return this.aliases == null ? List.of() : this.aliases;
    }

    /**
     * The API profiles for the resource provider.
     * 
     */
    @InputImport(name="apiProfiles", required=true)
    private final List<ApiProfileResponse> apiProfiles;

    public List<ApiProfileResponse> getApiProfiles() {
        return this.apiProfiles;
    }

    /**
     * The API version.
     * 
     */
    @InputImport(name="apiVersions")
    private final @Nullable List<String> apiVersions;

    public List<String> getApiVersions() {
        return this.apiVersions == null ? List.of() : this.apiVersions;
    }

    /**
     * The additional capabilities offered by this resource type.
     * 
     */
    @InputImport(name="capabilities")
    private final @Nullable String capabilities;

    public Optional<String> getCapabilities() {
        return this.capabilities == null ? Optional.empty() : Optional.ofNullable(this.capabilities);
    }

    /**
     * The default API version.
     * 
     */
    @InputImport(name="defaultApiVersion", required=true)
    private final String defaultApiVersion;

    public String getDefaultApiVersion() {
        return this.defaultApiVersion;
    }

    /**
     * The location mappings that are supported by this resource type.
     * 
     */
    @InputImport(name="locationMappings")
    private final @Nullable List<ProviderExtendedLocationResponse> locationMappings;

    public List<ProviderExtendedLocationResponse> getLocationMappings() {
        return this.locationMappings == null ? List.of() : this.locationMappings;
    }

    /**
     * The collection of locations where this resource type can be created.
     * 
     */
    @InputImport(name="locations")
    private final @Nullable List<String> locations;

    public List<String> getLocations() {
        return this.locations == null ? List.of() : this.locations;
    }

    /**
     * The properties.
     * 
     */
    @InputImport(name="properties")
    private final @Nullable Map<String,String> properties;

    public Map<String,String> getProperties() {
        return this.properties == null ? Map.of() : this.properties;
    }

    /**
     * The resource type.
     * 
     */
    @InputImport(name="resourceType")
    private final @Nullable String resourceType;

    public Optional<String> getPropResourceType() {
        return this.resourceType == null ? Optional.empty() : Optional.ofNullable(this.resourceType);
    }

    @InputImport(name="zoneMappings")
    private final @Nullable List<ZoneMappingResponse> zoneMappings;

    public List<ZoneMappingResponse> getZoneMappings() {
        return this.zoneMappings == null ? List.of() : this.zoneMappings;
    }

    public ProviderResourceTypeResponse(
        @Nullable List<AliasResponse> aliases,
        List<ApiProfileResponse> apiProfiles,
        @Nullable List<String> apiVersions,
        @Nullable String capabilities,
        String defaultApiVersion,
        @Nullable List<ProviderExtendedLocationResponse> locationMappings,
        @Nullable List<String> locations,
        @Nullable Map<String,String> properties,
        @Nullable String resourceType,
        @Nullable List<ZoneMappingResponse> zoneMappings) {
        this.aliases = aliases;
        this.apiProfiles = Objects.requireNonNull(apiProfiles, "expected parameter 'apiProfiles' to be non-null");
        this.apiVersions = apiVersions;
        this.capabilities = capabilities;
        this.defaultApiVersion = Objects.requireNonNull(defaultApiVersion, "expected parameter 'defaultApiVersion' to be non-null");
        this.locationMappings = locationMappings;
        this.locations = locations;
        this.properties = properties;
        this.resourceType = resourceType;
        this.zoneMappings = zoneMappings;
    }

    private ProviderResourceTypeResponse() {
        this.aliases = List.of();
        this.apiProfiles = List.of();
        this.apiVersions = List.of();
        this.capabilities = null;
        this.defaultApiVersion = null;
        this.locationMappings = List.of();
        this.locations = List.of();
        this.properties = Map.of();
        this.resourceType = null;
        this.zoneMappings = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProviderResourceTypeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<AliasResponse> aliases;
        private List<ApiProfileResponse> apiProfiles;
        private @Nullable List<String> apiVersions;
        private @Nullable String capabilities;
        private String defaultApiVersion;
        private @Nullable List<ProviderExtendedLocationResponse> locationMappings;
        private @Nullable List<String> locations;
        private @Nullable Map<String,String> properties;
        private @Nullable String resourceType;
        private @Nullable List<ZoneMappingResponse> zoneMappings;

        public Builder() {
    	      // Empty
        }

        public Builder(ProviderResourceTypeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aliases = defaults.aliases;
    	      this.apiProfiles = defaults.apiProfiles;
    	      this.apiVersions = defaults.apiVersions;
    	      this.capabilities = defaults.capabilities;
    	      this.defaultApiVersion = defaults.defaultApiVersion;
    	      this.locationMappings = defaults.locationMappings;
    	      this.locations = defaults.locations;
    	      this.properties = defaults.properties;
    	      this.resourceType = defaults.resourceType;
    	      this.zoneMappings = defaults.zoneMappings;
        }

        public Builder setAliases(@Nullable List<AliasResponse> aliases) {
            this.aliases = aliases;
            return this;
        }

        public Builder setApiProfiles(List<ApiProfileResponse> apiProfiles) {
            this.apiProfiles = Objects.requireNonNull(apiProfiles);
            return this;
        }

        public Builder setApiVersions(@Nullable List<String> apiVersions) {
            this.apiVersions = apiVersions;
            return this;
        }

        public Builder setCapabilities(@Nullable String capabilities) {
            this.capabilities = capabilities;
            return this;
        }

        public Builder setDefaultApiVersion(String defaultApiVersion) {
            this.defaultApiVersion = Objects.requireNonNull(defaultApiVersion);
            return this;
        }

        public Builder setLocationMappings(@Nullable List<ProviderExtendedLocationResponse> locationMappings) {
            this.locationMappings = locationMappings;
            return this;
        }

        public Builder setLocations(@Nullable List<String> locations) {
            this.locations = locations;
            return this;
        }

        public Builder setProperties(@Nullable Map<String,String> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setResourceType(@Nullable String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        public Builder setZoneMappings(@Nullable List<ZoneMappingResponse> zoneMappings) {
            this.zoneMappings = zoneMappings;
            return this;
        }

        public ProviderResourceTypeResponse build() {
            return new ProviderResourceTypeResponse(aliases, apiProfiles, apiVersions, capabilities, defaultApiVersion, locationMappings, locations, properties, resourceType, zoneMappings);
        }
    }
}
