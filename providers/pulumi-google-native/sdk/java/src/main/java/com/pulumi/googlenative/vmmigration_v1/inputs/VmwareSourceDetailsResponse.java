// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.vmmigration_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * VmwareSourceDetails message describes a specific source details for the vmware source type.
 * 
 */
public final class VmwareSourceDetailsResponse extends com.pulumi.resources.InvokeArgs {

    public static final VmwareSourceDetailsResponse Empty = new VmwareSourceDetailsResponse();

    /**
     * Input only. The credentials password. This is write only and can not be read in a GET operation.
     * 
     */
    @Import(name="password", required=true)
    private String password;

    /**
     * @return Input only. The credentials password. This is write only and can not be read in a GET operation.
     * 
     */
    public String password() {
        return this.password;
    }

    /**
     * The thumbprint representing the certificate for the vcenter.
     * 
     */
    @Import(name="thumbprint", required=true)
    private String thumbprint;

    /**
     * @return The thumbprint representing the certificate for the vcenter.
     * 
     */
    public String thumbprint() {
        return this.thumbprint;
    }

    /**
     * The credentials username.
     * 
     */
    @Import(name="username", required=true)
    private String username;

    /**
     * @return The credentials username.
     * 
     */
    public String username() {
        return this.username;
    }

    /**
     * The ip address of the vcenter this Source represents.
     * 
     */
    @Import(name="vcenterIp", required=true)
    private String vcenterIp;

    /**
     * @return The ip address of the vcenter this Source represents.
     * 
     */
    public String vcenterIp() {
        return this.vcenterIp;
    }

    private VmwareSourceDetailsResponse() {}

    private VmwareSourceDetailsResponse(VmwareSourceDetailsResponse $) {
        this.password = $.password;
        this.thumbprint = $.thumbprint;
        this.username = $.username;
        this.vcenterIp = $.vcenterIp;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VmwareSourceDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VmwareSourceDetailsResponse $;

        public Builder() {
            $ = new VmwareSourceDetailsResponse();
        }

        public Builder(VmwareSourceDetailsResponse defaults) {
            $ = new VmwareSourceDetailsResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param password Input only. The credentials password. This is write only and can not be read in a GET operation.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            $.password = password;
            return this;
        }

        /**
         * @param thumbprint The thumbprint representing the certificate for the vcenter.
         * 
         * @return builder
         * 
         */
        public Builder thumbprint(String thumbprint) {
            $.thumbprint = thumbprint;
            return this;
        }

        /**
         * @param username The credentials username.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            $.username = username;
            return this;
        }

        /**
         * @param vcenterIp The ip address of the vcenter this Source represents.
         * 
         * @return builder
         * 
         */
        public Builder vcenterIp(String vcenterIp) {
            $.vcenterIp = vcenterIp;
            return this;
        }

        public VmwareSourceDetailsResponse build() {
            $.password = Objects.requireNonNull($.password, "expected parameter 'password' to be non-null");
            $.thumbprint = Objects.requireNonNull($.thumbprint, "expected parameter 'thumbprint' to be non-null");
            $.username = Objects.requireNonNull($.username, "expected parameter 'username' to be non-null");
            $.vcenterIp = Objects.requireNonNull($.vcenterIp, "expected parameter 'vcenterIp' to be non-null");
            return $;
        }
    }

}
