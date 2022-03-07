// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.servicecatalog.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetProductResult {
    private final @Nullable String acceptLanguage;
    /**
     * ARN of the product.
     * 
     */
    private final String arn;
    /**
     * Time when the product was created.
     * 
     */
    private final String createdTime;
    /**
     * Description of the product.
     * 
     */
    private final String description;
    /**
     * Distributor (i.e., vendor) of the product.
     * 
     */
    private final String distributor;
    /**
     * Whether the product has a default path.
     * 
     */
    private final Boolean hasDefaultPath;
    private final String id;
    /**
     * Name of the product.
     * 
     */
    private final String name;
    /**
     * Owner of the product.
     * 
     */
    private final String owner;
    /**
     * Status of the product.
     * 
     */
    private final String status;
    /**
     * Support information about the product.
     * 
     */
    private final String supportDescription;
    /**
     * Contact email for product support.
     * 
     */
    private final String supportEmail;
    /**
     * Contact URL for product support.
     * 
     */
    private final String supportUrl;
    /**
     * Tags to apply to the product.
     * 
     */
    private final Map<String,String> tags;
    /**
     * Type of product.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"acceptLanguage","arn","createdTime","description","distributor","hasDefaultPath","id","name","owner","status","supportDescription","supportEmail","supportUrl","tags","type"})
    private GetProductResult(
        @Nullable String acceptLanguage,
        String arn,
        String createdTime,
        String description,
        String distributor,
        Boolean hasDefaultPath,
        String id,
        String name,
        String owner,
        String status,
        String supportDescription,
        String supportEmail,
        String supportUrl,
        Map<String,String> tags,
        String type) {
        this.acceptLanguage = acceptLanguage;
        this.arn = Objects.requireNonNull(arn);
        this.createdTime = Objects.requireNonNull(createdTime);
        this.description = Objects.requireNonNull(description);
        this.distributor = Objects.requireNonNull(distributor);
        this.hasDefaultPath = Objects.requireNonNull(hasDefaultPath);
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.owner = Objects.requireNonNull(owner);
        this.status = Objects.requireNonNull(status);
        this.supportDescription = Objects.requireNonNull(supportDescription);
        this.supportEmail = Objects.requireNonNull(supportEmail);
        this.supportUrl = Objects.requireNonNull(supportUrl);
        this.tags = Objects.requireNonNull(tags);
        this.type = Objects.requireNonNull(type);
    }

    public Optional<String> getAcceptLanguage() {
        return Optional.ofNullable(this.acceptLanguage);
    }
    /**
     * ARN of the product.
     * 
    */
    public String getArn() {
        return this.arn;
    }
    /**
     * Time when the product was created.
     * 
    */
    public String getCreatedTime() {
        return this.createdTime;
    }
    /**
     * Description of the product.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * Distributor (i.e., vendor) of the product.
     * 
    */
    public String getDistributor() {
        return this.distributor;
    }
    /**
     * Whether the product has a default path.
     * 
    */
    public Boolean getHasDefaultPath() {
        return this.hasDefaultPath;
    }
    public String getId() {
        return this.id;
    }
    /**
     * Name of the product.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Owner of the product.
     * 
    */
    public String getOwner() {
        return this.owner;
    }
    /**
     * Status of the product.
     * 
    */
    public String getStatus() {
        return this.status;
    }
    /**
     * Support information about the product.
     * 
    */
    public String getSupportDescription() {
        return this.supportDescription;
    }
    /**
     * Contact email for product support.
     * 
    */
    public String getSupportEmail() {
        return this.supportEmail;
    }
    /**
     * Contact URL for product support.
     * 
    */
    public String getSupportUrl() {
        return this.supportUrl;
    }
    /**
     * Tags to apply to the product.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags;
    }
    /**
     * Type of product.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProductResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String acceptLanguage;
        private String arn;
        private String createdTime;
        private String description;
        private String distributor;
        private Boolean hasDefaultPath;
        private String id;
        private String name;
        private String owner;
        private String status;
        private String supportDescription;
        private String supportEmail;
        private String supportUrl;
        private Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetProductResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceptLanguage = defaults.acceptLanguage;
    	      this.arn = defaults.arn;
    	      this.createdTime = defaults.createdTime;
    	      this.description = defaults.description;
    	      this.distributor = defaults.distributor;
    	      this.hasDefaultPath = defaults.hasDefaultPath;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.owner = defaults.owner;
    	      this.status = defaults.status;
    	      this.supportDescription = defaults.supportDescription;
    	      this.supportEmail = defaults.supportEmail;
    	      this.supportUrl = defaults.supportUrl;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setAcceptLanguage(@Nullable String acceptLanguage) {
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setCreatedTime(String createdTime) {
            this.createdTime = Objects.requireNonNull(createdTime);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDistributor(String distributor) {
            this.distributor = Objects.requireNonNull(distributor);
            return this;
        }

        public Builder setHasDefaultPath(Boolean hasDefaultPath) {
            this.hasDefaultPath = Objects.requireNonNull(hasDefaultPath);
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

        public Builder setOwner(String owner) {
            this.owner = Objects.requireNonNull(owner);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setSupportDescription(String supportDescription) {
            this.supportDescription = Objects.requireNonNull(supportDescription);
            return this;
        }

        public Builder setSupportEmail(String supportEmail) {
            this.supportEmail = Objects.requireNonNull(supportEmail);
            return this;
        }

        public Builder setSupportUrl(String supportUrl) {
            this.supportUrl = Objects.requireNonNull(supportUrl);
            return this;
        }

        public Builder setTags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetProductResult build() {
            return new GetProductResult(acceptLanguage, arn, createdTime, description, distributor, hasDefaultPath, id, name, owner, status, supportDescription, supportEmail, supportUrl, tags, type);
        }
    }
}