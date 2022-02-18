// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetStaticSiteUserProvidedFunctionAppForStaticSiteResult {
    /**
     * The date and time on which the function app was registered with the static site.
     * 
     */
    private final String createdOn;
    /**
     * The region of the function app registered with the static site
     * 
     */
    private final @Nullable String functionAppRegion;
    /**
     * The resource id of the function app registered with the static site
     * 
     */
    private final @Nullable String functionAppResourceId;
    /**
     * Resource Id.
     * 
     */
    private final String id;
    /**
     * Kind of resource.
     * 
     */
    private final @Nullable String kind;
    /**
     * Resource Name.
     * 
     */
    private final String name;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"createdOn","functionAppRegion","functionAppResourceId","id","kind","name","type"})
    private GetStaticSiteUserProvidedFunctionAppForStaticSiteResult(
        String createdOn,
        @Nullable String functionAppRegion,
        @Nullable String functionAppResourceId,
        String id,
        @Nullable String kind,
        String name,
        String type) {
        this.createdOn = Objects.requireNonNull(createdOn);
        this.functionAppRegion = functionAppRegion;
        this.functionAppResourceId = functionAppResourceId;
        this.id = Objects.requireNonNull(id);
        this.kind = kind;
        this.name = Objects.requireNonNull(name);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The date and time on which the function app was registered with the static site.
     * 
     */
    public String getCreatedOn() {
        return this.createdOn;
    }
    /**
     * The region of the function app registered with the static site
     * 
     */
    public Optional<String> getFunctionAppRegion() {
        return Optional.ofNullable(this.functionAppRegion);
    }
    /**
     * The resource id of the function app registered with the static site
     * 
     */
    public Optional<String> getFunctionAppResourceId() {
        return Optional.ofNullable(this.functionAppResourceId);
    }
    /**
     * Resource Id.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Kind of resource.
     * 
     */
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * Resource Name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Resource type.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStaticSiteUserProvidedFunctionAppForStaticSiteResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createdOn;
        private @Nullable String functionAppRegion;
        private @Nullable String functionAppResourceId;
        private String id;
        private @Nullable String kind;
        private String name;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetStaticSiteUserProvidedFunctionAppForStaticSiteResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdOn = defaults.createdOn;
    	      this.functionAppRegion = defaults.functionAppRegion;
    	      this.functionAppResourceId = defaults.functionAppResourceId;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder setCreatedOn(String createdOn) {
            this.createdOn = Objects.requireNonNull(createdOn);
            return this;
        }

        public Builder setFunctionAppRegion(@Nullable String functionAppRegion) {
            this.functionAppRegion = functionAppRegion;
            return this;
        }

        public Builder setFunctionAppResourceId(@Nullable String functionAppResourceId) {
            this.functionAppResourceId = functionAppResourceId;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetStaticSiteUserProvidedFunctionAppForStaticSiteResult build() {
            return new GetStaticSiteUserProvidedFunctionAppForStaticSiteResult(createdOn, functionAppRegion, functionAppResourceId, id, kind, name, type);
        }
    }
}
