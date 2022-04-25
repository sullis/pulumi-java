// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetOrganizationalUnitsChildren {
    /**
     * @return ARN of the organizational unit
     * 
     */
    private final String arn;
    /**
     * @return Parent identifier of the organizational units.
     * 
     */
    private final String id;
    /**
     * @return Name of the organizational unit
     * 
     */
    private final String name;

    @CustomType.Constructor
    private GetOrganizationalUnitsChildren(
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name) {
        this.arn = arn;
        this.id = id;
        this.name = name;
    }

    /**
     * @return ARN of the organizational unit
     * 
     */
    public String arn() {
        return this.arn;
    }
    /**
     * @return Parent identifier of the organizational units.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Name of the organizational unit
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOrganizationalUnitsChildren defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String id;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOrganizationalUnitsChildren defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public GetOrganizationalUnitsChildren build() {
            return new GetOrganizationalUnitsChildren(arn, id, name);
        }
    }
}
