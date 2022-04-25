// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.sqladmin_v1beta4.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * An entry for an Access Control list.
 * 
 */
public final class AclEntryResponse extends com.pulumi.resources.InvokeArgs {

    public static final AclEntryResponse Empty = new AclEntryResponse();

    /**
     * The time when this access control entry expires in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`.
     * 
     */
    @Import(name="expirationTime", required=true)
    private String expirationTime;

    /**
     * @return The time when this access control entry expires in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`.
     * 
     */
    public String expirationTime() {
        return this.expirationTime;
    }

    /**
     * This is always `sql#aclEntry`.
     * 
     */
    @Import(name="kind", required=true)
    private String kind;

    /**
     * @return This is always `sql#aclEntry`.
     * 
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Optional. A label to identify this entry.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Optional. A label to identify this entry.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The allowlisted value for the access control list.
     * 
     */
    @Import(name="value", required=true)
    private String value;

    /**
     * @return The allowlisted value for the access control list.
     * 
     */
    public String value() {
        return this.value;
    }

    private AclEntryResponse() {}

    private AclEntryResponse(AclEntryResponse $) {
        this.expirationTime = $.expirationTime;
        this.kind = $.kind;
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AclEntryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AclEntryResponse $;

        public Builder() {
            $ = new AclEntryResponse();
        }

        public Builder(AclEntryResponse defaults) {
            $ = new AclEntryResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param expirationTime The time when this access control entry expires in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`.
         * 
         * @return builder
         * 
         */
        public Builder expirationTime(String expirationTime) {
            $.expirationTime = expirationTime;
            return this;
        }

        /**
         * @param kind This is always `sql#aclEntry`.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param name Optional. A label to identify this entry.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param value The allowlisted value for the access control list.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            $.value = value;
            return this;
        }

        public AclEntryResponse build() {
            $.expirationTime = Objects.requireNonNull($.expirationTime, "expected parameter 'expirationTime' to be non-null");
            $.kind = Objects.requireNonNull($.kind, "expected parameter 'kind' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
