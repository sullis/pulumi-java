// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.qldb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetLedgerResult {
    private final String arn;
    private final Boolean deletionProtection;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String name;
    private final String permissionsMode;

    @CustomType.Constructor
    private GetLedgerResult(
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("deletionProtection") Boolean deletionProtection,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("permissionsMode") String permissionsMode) {
        this.arn = arn;
        this.deletionProtection = deletionProtection;
        this.id = id;
        this.name = name;
        this.permissionsMode = permissionsMode;
    }

    public String arn() {
        return this.arn;
    }
    public Boolean deletionProtection() {
        return this.deletionProtection;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String name() {
        return this.name;
    }
    public String permissionsMode() {
        return this.permissionsMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLedgerResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private Boolean deletionProtection;
        private String id;
        private String name;
        private String permissionsMode;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLedgerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.deletionProtection = defaults.deletionProtection;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.permissionsMode = defaults.permissionsMode;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder deletionProtection(Boolean deletionProtection) {
            this.deletionProtection = Objects.requireNonNull(deletionProtection);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder permissionsMode(String permissionsMode) {
            this.permissionsMode = Objects.requireNonNull(permissionsMode);
            return this;
        }        public GetLedgerResult build() {
            return new GetLedgerResult(arn, deletionProtection, id, name, permissionsMode);
        }
    }
}
