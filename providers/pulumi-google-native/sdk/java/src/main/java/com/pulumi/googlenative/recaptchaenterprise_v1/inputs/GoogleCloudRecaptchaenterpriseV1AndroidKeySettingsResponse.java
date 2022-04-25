// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.recaptchaenterprise_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Settings specific to keys that can be used by Android apps.
 * 
 */
public final class GoogleCloudRecaptchaenterpriseV1AndroidKeySettingsResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudRecaptchaenterpriseV1AndroidKeySettingsResponse Empty = new GoogleCloudRecaptchaenterpriseV1AndroidKeySettingsResponse();

    /**
     * If set to true, allowed_package_names are not enforced.
     * 
     */
    @Import(name="allowAllPackageNames", required=true)
    private Boolean allowAllPackageNames;

    /**
     * @return If set to true, allowed_package_names are not enforced.
     * 
     */
    public Boolean allowAllPackageNames() {
        return this.allowAllPackageNames;
    }

    /**
     * Android package names of apps allowed to use the key. Example: &#39;com.companyname.appname&#39;
     * 
     */
    @Import(name="allowedPackageNames", required=true)
    private List<String> allowedPackageNames;

    /**
     * @return Android package names of apps allowed to use the key. Example: &#39;com.companyname.appname&#39;
     * 
     */
    public List<String> allowedPackageNames() {
        return this.allowedPackageNames;
    }

    private GoogleCloudRecaptchaenterpriseV1AndroidKeySettingsResponse() {}

    private GoogleCloudRecaptchaenterpriseV1AndroidKeySettingsResponse(GoogleCloudRecaptchaenterpriseV1AndroidKeySettingsResponse $) {
        this.allowAllPackageNames = $.allowAllPackageNames;
        this.allowedPackageNames = $.allowedPackageNames;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudRecaptchaenterpriseV1AndroidKeySettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudRecaptchaenterpriseV1AndroidKeySettingsResponse $;

        public Builder() {
            $ = new GoogleCloudRecaptchaenterpriseV1AndroidKeySettingsResponse();
        }

        public Builder(GoogleCloudRecaptchaenterpriseV1AndroidKeySettingsResponse defaults) {
            $ = new GoogleCloudRecaptchaenterpriseV1AndroidKeySettingsResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowAllPackageNames If set to true, allowed_package_names are not enforced.
         * 
         * @return builder
         * 
         */
        public Builder allowAllPackageNames(Boolean allowAllPackageNames) {
            $.allowAllPackageNames = allowAllPackageNames;
            return this;
        }

        /**
         * @param allowedPackageNames Android package names of apps allowed to use the key. Example: &#39;com.companyname.appname&#39;
         * 
         * @return builder
         * 
         */
        public Builder allowedPackageNames(List<String> allowedPackageNames) {
            $.allowedPackageNames = allowedPackageNames;
            return this;
        }

        /**
         * @param allowedPackageNames Android package names of apps allowed to use the key. Example: &#39;com.companyname.appname&#39;
         * 
         * @return builder
         * 
         */
        public Builder allowedPackageNames(String... allowedPackageNames) {
            return allowedPackageNames(List.of(allowedPackageNames));
        }

        public GoogleCloudRecaptchaenterpriseV1AndroidKeySettingsResponse build() {
            $.allowAllPackageNames = Objects.requireNonNull($.allowAllPackageNames, "expected parameter 'allowAllPackageNames' to be non-null");
            $.allowedPackageNames = Objects.requireNonNull($.allowedPackageNames, "expected parameter 'allowedPackageNames' to be non-null");
            return $;
        }
    }

}
