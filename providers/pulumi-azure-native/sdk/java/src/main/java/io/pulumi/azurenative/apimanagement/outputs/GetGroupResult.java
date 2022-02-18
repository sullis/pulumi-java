// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetGroupResult {
    /**
     * true if the group is one of the three system groups (Administrators, Developers, or Guests); otherwise false.
     * 
     */
    private final Boolean builtIn;
    /**
     * Group description. Can contain HTML formatting tags.
     * 
     */
    private final @Nullable String description;
    /**
     * Group name.
     * 
     */
    private final String displayName;
    /**
     * For external groups, this property contains the id of the group from the external identity provider, e.g. for Azure Active Directory `aad://<tenant>.onmicrosoft.com/groups/<group object id>`; otherwise the value is null.
     * 
     */
    private final @Nullable String externalId;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * Resource type for API Management resource.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"builtIn","description","displayName","externalId","id","name","type"})
    private GetGroupResult(
        Boolean builtIn,
        @Nullable String description,
        String displayName,
        @Nullable String externalId,
        String id,
        String name,
        String type) {
        this.builtIn = Objects.requireNonNull(builtIn);
        this.description = description;
        this.displayName = Objects.requireNonNull(displayName);
        this.externalId = externalId;
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * true if the group is one of the three system groups (Administrators, Developers, or Guests); otherwise false.
     * 
     */
    public Boolean getBuiltIn() {
        return this.builtIn;
    }
    /**
     * Group description. Can contain HTML formatting tags.
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Group name.
     * 
     */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * For external groups, this property contains the id of the group from the external identity provider, e.g. for Azure Active Directory `aad://<tenant>.onmicrosoft.com/groups/<group object id>`; otherwise the value is null.
     * 
     */
    public Optional<String> getExternalId() {
        return Optional.ofNullable(this.externalId);
    }
    /**
     * Resource ID.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Resource name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Resource type for API Management resource.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGroupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean builtIn;
        private @Nullable String description;
        private String displayName;
        private @Nullable String externalId;
        private String id;
        private String name;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.builtIn = defaults.builtIn;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.externalId = defaults.externalId;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder setBuiltIn(Boolean builtIn) {
            this.builtIn = Objects.requireNonNull(builtIn);
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setExternalId(@Nullable String externalId) {
            this.externalId = externalId;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
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

        public GetGroupResult build() {
            return new GetGroupResult(builtIn, description, displayName, externalId, id, name, type);
        }
    }
}
