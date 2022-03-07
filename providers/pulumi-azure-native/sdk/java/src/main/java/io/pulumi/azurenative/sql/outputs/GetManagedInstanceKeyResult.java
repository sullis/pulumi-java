// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetManagedInstanceKeyResult {
    /**
     * Key auto rotation opt-in flag. Either true or false.
     * 
     */
    private final Boolean autoRotationEnabled;
    /**
     * The key creation date.
     * 
     */
    private final String creationDate;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Kind of encryption protector. This is metadata used for the Azure portal experience.
     * 
     */
    private final String kind;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * Thumbprint of the key.
     * 
     */
    private final String thumbprint;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"autoRotationEnabled","creationDate","id","kind","name","thumbprint","type"})
    private GetManagedInstanceKeyResult(
        Boolean autoRotationEnabled,
        String creationDate,
        String id,
        String kind,
        String name,
        String thumbprint,
        String type) {
        this.autoRotationEnabled = Objects.requireNonNull(autoRotationEnabled);
        this.creationDate = Objects.requireNonNull(creationDate);
        this.id = Objects.requireNonNull(id);
        this.kind = Objects.requireNonNull(kind);
        this.name = Objects.requireNonNull(name);
        this.thumbprint = Objects.requireNonNull(thumbprint);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Key auto rotation opt-in flag. Either true or false.
     * 
    */
    public Boolean getAutoRotationEnabled() {
        return this.autoRotationEnabled;
    }
    /**
     * The key creation date.
     * 
    */
    public String getCreationDate() {
        return this.creationDate;
    }
    /**
     * Resource ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Kind of encryption protector. This is metadata used for the Azure portal experience.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * Resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Thumbprint of the key.
     * 
    */
    public String getThumbprint() {
        return this.thumbprint;
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

    public static Builder builder(GetManagedInstanceKeyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean autoRotationEnabled;
        private String creationDate;
        private String id;
        private String kind;
        private String name;
        private String thumbprint;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetManagedInstanceKeyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoRotationEnabled = defaults.autoRotationEnabled;
    	      this.creationDate = defaults.creationDate;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.thumbprint = defaults.thumbprint;
    	      this.type = defaults.type;
        }

        public Builder setAutoRotationEnabled(Boolean autoRotationEnabled) {
            this.autoRotationEnabled = Objects.requireNonNull(autoRotationEnabled);
            return this;
        }

        public Builder setCreationDate(String creationDate) {
            this.creationDate = Objects.requireNonNull(creationDate);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setThumbprint(String thumbprint) {
            this.thumbprint = Objects.requireNonNull(thumbprint);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetManagedInstanceKeyResult build() {
            return new GetManagedInstanceKeyResult(autoRotationEnabled, creationDate, id, kind, name, thumbprint, type);
        }
    }
}