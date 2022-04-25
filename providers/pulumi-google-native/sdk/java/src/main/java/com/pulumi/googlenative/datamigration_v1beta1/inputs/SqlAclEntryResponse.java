// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datamigration_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * An entry for an Access Control list.
 * 
 */
public final class SqlAclEntryResponse extends com.pulumi.resources.InvokeArgs {

    public static final SqlAclEntryResponse Empty = new SqlAclEntryResponse();

    /**
     * The time when this access control entry expires in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example: `2012-11-15T16:19:00.094Z`.
     * 
     */
    @Import(name="expireTime", required=true)
    private String expireTime;

    /**
     * @return The time when this access control entry expires in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example: `2012-11-15T16:19:00.094Z`.
     * 
     */
    public String expireTime() {
        return this.expireTime;
    }

    /**
     * A label to identify this entry.
     * 
     */
    @Import(name="label", required=true)
    private String label;

    /**
     * @return A label to identify this entry.
     * 
     */
    public String label() {
        return this.label;
    }

    /**
     * Input only. The time-to-leave of this access control entry.
     * 
     */
    @Import(name="ttl", required=true)
    private String ttl;

    /**
     * @return Input only. The time-to-leave of this access control entry.
     * 
     */
    public String ttl() {
        return this.ttl;
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

    private SqlAclEntryResponse() {}

    private SqlAclEntryResponse(SqlAclEntryResponse $) {
        this.expireTime = $.expireTime;
        this.label = $.label;
        this.ttl = $.ttl;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SqlAclEntryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SqlAclEntryResponse $;

        public Builder() {
            $ = new SqlAclEntryResponse();
        }

        public Builder(SqlAclEntryResponse defaults) {
            $ = new SqlAclEntryResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param expireTime The time when this access control entry expires in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example: `2012-11-15T16:19:00.094Z`.
         * 
         * @return builder
         * 
         */
        public Builder expireTime(String expireTime) {
            $.expireTime = expireTime;
            return this;
        }

        /**
         * @param label A label to identify this entry.
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            $.label = label;
            return this;
        }

        /**
         * @param ttl Input only. The time-to-leave of this access control entry.
         * 
         * @return builder
         * 
         */
        public Builder ttl(String ttl) {
            $.ttl = ttl;
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

        public SqlAclEntryResponse build() {
            $.expireTime = Objects.requireNonNull($.expireTime, "expected parameter 'expireTime' to be non-null");
            $.label = Objects.requireNonNull($.label, "expected parameter 'label' to be non-null");
            $.ttl = Objects.requireNonNull($.ttl, "expected parameter 'ttl' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
