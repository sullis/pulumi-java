// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.outposts.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSiteResult {
    /**
     * @return AWS Account identifier.
     * 
     */
    private final String accountId;
    /**
     * @return Description.
     * 
     */
    private final String description;
    private final String id;
    private final String name;

    @CustomType.Constructor
    private GetSiteResult(
        @CustomType.Parameter("accountId") String accountId,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name) {
        this.accountId = accountId;
        this.description = description;
        this.id = id;
        this.name = name;
    }

    /**
     * @return AWS Account identifier.
     * 
     */
    public String accountId() {
        return this.accountId;
    }
    /**
     * @return Description.
     * 
     */
    public String description() {
        return this.description;
    }
    public String id() {
        return this.id;
    }
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSiteResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountId;
        private String description;
        private String id;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSiteResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        public Builder accountId(String accountId) {
            this.accountId = Objects.requireNonNull(accountId);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public GetSiteResult build() {
            return new GetSiteResult(accountId, description, id, name);
        }
    }
}
