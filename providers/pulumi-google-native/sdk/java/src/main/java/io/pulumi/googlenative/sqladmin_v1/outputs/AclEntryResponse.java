// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class AclEntryResponse {
    /**
     * The time when this access control entry expires in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`.
     * 
     */
    private final String expirationTime;
    /**
     * This is always `sql#aclEntry`.
     * 
     */
    private final String kind;
    /**
     * Optional. A label to identify this entry.
     * 
     */
    private final String name;
    /**
     * The allowlisted value for the access control list.
     * 
     */
    private final String value;

    @OutputCustomType.Constructor({"expirationTime","kind","name","value"})
    private AclEntryResponse(
        String expirationTime,
        String kind,
        String name,
        String value) {
        this.expirationTime = Objects.requireNonNull(expirationTime);
        this.kind = Objects.requireNonNull(kind);
        this.name = Objects.requireNonNull(name);
        this.value = Objects.requireNonNull(value);
    }

    /**
     * The time when this access control entry expires in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`.
     * 
    */
    public String getExpirationTime() {
        return this.expirationTime;
    }
    /**
     * This is always `sql#aclEntry`.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * Optional. A label to identify this entry.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The allowlisted value for the access control list.
     * 
    */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AclEntryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String expirationTime;
        private String kind;
        private String name;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(AclEntryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expirationTime = defaults.expirationTime;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder setExpirationTime(String expirationTime) {
            this.expirationTime = Objects.requireNonNull(expirationTime);
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

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public AclEntryResponse build() {
            return new AclEntryResponse(expirationTime, kind, name, value);
        }
    }
}