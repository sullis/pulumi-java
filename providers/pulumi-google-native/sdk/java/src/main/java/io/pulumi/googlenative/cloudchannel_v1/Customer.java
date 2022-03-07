// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudchannel_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.cloudchannel_v1.CustomerArgs;
import io.pulumi.googlenative.cloudchannel_v1.outputs.GoogleCloudChannelV1CloudIdentityInfoResponse;
import io.pulumi.googlenative.cloudchannel_v1.outputs.GoogleCloudChannelV1ContactInfoResponse;
import io.pulumi.googlenative.cloudchannel_v1.outputs.GoogleTypePostalAddressResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a new Customer resource under the reseller or distributor account. Possible error codes: * PERMISSION_DENIED: The reseller account making the request is different from the reseller account in the API request. * INVALID_ARGUMENT: * Required request parameters are missing or invalid. * Domain field value doesn't match the primary email domain. Return value: The newly created Customer resource.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:cloudchannel/v1:Customer")
public class Customer extends io.pulumi.resources.CustomResource {
    /**
     * Secondary contact email. You need to provide an alternate email to create different domains if a primary contact email already exists. Users will receive a notification with credentials when you create an admin.google.com account. Secondary emails are also recovery email addresses. Alternate emails are optional when you create Team customers.
     * 
     */
    @OutputExport(name="alternateEmail", type=String.class, parameters={})
    private Output<String> alternateEmail;

    /**
     * @return Secondary contact email. You need to provide an alternate email to create different domains if a primary contact email already exists. Users will receive a notification with credentials when you create an admin.google.com account. Secondary emails are also recovery email addresses. Alternate emails are optional when you create Team customers.
     * 
     */
    public Output<String> getAlternateEmail() {
        return this.alternateEmail;
    }
    /**
     * Cloud Identity ID of the customer's channel partner. Populated only if a channel partner exists for this customer.
     * 
     */
    @OutputExport(name="channelPartnerId", type=String.class, parameters={})
    private Output<String> channelPartnerId;

    /**
     * @return Cloud Identity ID of the customer's channel partner. Populated only if a channel partner exists for this customer.
     * 
     */
    public Output<String> getChannelPartnerId() {
        return this.channelPartnerId;
    }
    /**
     * The customer's Cloud Identity ID if the customer has a Cloud Identity resource.
     * 
     */
    @OutputExport(name="cloudIdentityId", type=String.class, parameters={})
    private Output<String> cloudIdentityId;

    /**
     * @return The customer's Cloud Identity ID if the customer has a Cloud Identity resource.
     * 
     */
    public Output<String> getCloudIdentityId() {
        return this.cloudIdentityId;
    }
    /**
     * Cloud Identity information for the customer. Populated only if a Cloud Identity account exists for this customer.
     * 
     */
    @OutputExport(name="cloudIdentityInfo", type=GoogleCloudChannelV1CloudIdentityInfoResponse.class, parameters={})
    private Output<GoogleCloudChannelV1CloudIdentityInfoResponse> cloudIdentityInfo;

    /**
     * @return Cloud Identity information for the customer. Populated only if a Cloud Identity account exists for this customer.
     * 
     */
    public Output<GoogleCloudChannelV1CloudIdentityInfoResponse> getCloudIdentityInfo() {
        return this.cloudIdentityInfo;
    }
    /**
     * Time when the customer was created.
     * 
     */
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Time when the customer was created.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * The customer's primary domain. Must match the primary contact email's domain.
     * 
     */
    @OutputExport(name="domain", type=String.class, parameters={})
    private Output<String> domain;

    /**
     * @return The customer's primary domain. Must match the primary contact email's domain.
     * 
     */
    public Output<String> getDomain() {
        return this.domain;
    }
    /**
     * Optional. The BCP-47 language code, such as "en-US" or "sr-Latn". For more information, see https://www.unicode.org/reports/tr35/#Unicode_locale_identifier.
     * 
     */
    @OutputExport(name="languageCode", type=String.class, parameters={})
    private Output<String> languageCode;

    /**
     * @return Optional. The BCP-47 language code, such as "en-US" or "sr-Latn". For more information, see https://www.unicode.org/reports/tr35/#Unicode_locale_identifier.
     * 
     */
    public Output<String> getLanguageCode() {
        return this.languageCode;
    }
    /**
     * Resource name of the customer. Format: accounts/{account_id}/customers/{customer_id}
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name of the customer. Format: accounts/{account_id}/customers/{customer_id}
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Name of the organization that the customer entity represents.
     * 
     */
    @OutputExport(name="orgDisplayName", type=String.class, parameters={})
    private Output<String> orgDisplayName;

    /**
     * @return Name of the organization that the customer entity represents.
     * 
     */
    public Output<String> getOrgDisplayName() {
        return this.orgDisplayName;
    }
    /**
     * The organization address for the customer. To enforce US laws and embargoes, we require a region and zip code. You must provide valid addresses for every customer. To set the customer's language, use the Customer-level language code.
     * 
     */
    @OutputExport(name="orgPostalAddress", type=GoogleTypePostalAddressResponse.class, parameters={})
    private Output<GoogleTypePostalAddressResponse> orgPostalAddress;

    /**
     * @return The organization address for the customer. To enforce US laws and embargoes, we require a region and zip code. You must provide valid addresses for every customer. To set the customer's language, use the Customer-level language code.
     * 
     */
    public Output<GoogleTypePostalAddressResponse> getOrgPostalAddress() {
        return this.orgPostalAddress;
    }
    /**
     * Primary contact info.
     * 
     */
    @OutputExport(name="primaryContactInfo", type=GoogleCloudChannelV1ContactInfoResponse.class, parameters={})
    private Output<GoogleCloudChannelV1ContactInfoResponse> primaryContactInfo;

    /**
     * @return Primary contact info.
     * 
     */
    public Output<GoogleCloudChannelV1ContactInfoResponse> getPrimaryContactInfo() {
        return this.primaryContactInfo;
    }
    /**
     * Time when the customer was updated.
     * 
     */
    @OutputExport(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return Time when the customer was updated.
     * 
     */
    public Output<String> getUpdateTime() {
        return this.updateTime;
    }

    public interface BuilderApplicator {
        public void apply(CustomerArgs.Builder a);
    }
    private static io.pulumi.googlenative.cloudchannel_v1.CustomerArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.cloudchannel_v1.CustomerArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Customer(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Customer(String name) {
        this(name, CustomerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Customer(String name, CustomerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Customer(String name, CustomerArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:cloudchannel/v1:Customer", name, args == null ? CustomerArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Customer(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:cloudchannel/v1:Customer", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Customer get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Customer(name, id, options);
    }
}