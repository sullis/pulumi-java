// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.jobs_v3;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.jobs_v3.CompanyArgs;
import io.pulumi.googlenative.jobs_v3.outputs.CompanyDerivedInfoResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a new company entity.
 * 
 */
@ResourceType(type="google-native:jobs/v3:Company")
public class Company extends io.pulumi.resources.CustomResource {
    /**
     * Optional. The URI to employer's career site or careers page on the employer's web site, for example, "https://careers.google.com".
     * 
     */
    @OutputExport(name="careerSiteUri", type=String.class, parameters={})
    private Output<String> careerSiteUri;

    /**
     * @return Optional. The URI to employer's career site or careers page on the employer's web site, for example, "https://careers.google.com".
     * 
     */
    public Output<String> getCareerSiteUri() {
        return this.careerSiteUri;
    }
    /**
     * Derived details about the company.
     * 
     */
    @OutputExport(name="derivedInfo", type=CompanyDerivedInfoResponse.class, parameters={})
    private Output<CompanyDerivedInfoResponse> derivedInfo;

    /**
     * @return Derived details about the company.
     * 
     */
    public Output<CompanyDerivedInfoResponse> getDerivedInfo() {
        return this.derivedInfo;
    }
    /**
     * The display name of the company, for example, "Google LLC".
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The display name of the company, for example, "Google LLC".
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * Optional. Equal Employment Opportunity legal disclaimer text to be associated with all jobs, and typically to be displayed in all roles. The maximum number of allowed characters is 500.
     * 
     */
    @OutputExport(name="eeoText", type=String.class, parameters={})
    private Output<String> eeoText;

    /**
     * @return Optional. Equal Employment Opportunity legal disclaimer text to be associated with all jobs, and typically to be displayed in all roles. The maximum number of allowed characters is 500.
     * 
     */
    public Output<String> getEeoText() {
        return this.eeoText;
    }
    /**
     * Client side company identifier, used to uniquely identify the company. The maximum number of allowed characters is 255.
     * 
     */
    @OutputExport(name="externalId", type=String.class, parameters={})
    private Output<String> externalId;

    /**
     * @return Client side company identifier, used to uniquely identify the company. The maximum number of allowed characters is 255.
     * 
     */
    public Output<String> getExternalId() {
        return this.externalId;
    }
    /**
     * Optional. The street address of the company's main headquarters, which may be different from the job location. The service attempts to geolocate the provided address, and populates a more specific location wherever possible in DerivedInfo.headquarters_location.
     * 
     */
    @OutputExport(name="headquartersAddress", type=String.class, parameters={})
    private Output<String> headquartersAddress;

    /**
     * @return Optional. The street address of the company's main headquarters, which may be different from the job location. The service attempts to geolocate the provided address, and populates a more specific location wherever possible in DerivedInfo.headquarters_location.
     * 
     */
    public Output<String> getHeadquartersAddress() {
        return this.headquartersAddress;
    }
    /**
     * Optional. Set to true if it is the hiring agency that post jobs for other employers. Defaults to false if not provided.
     * 
     */
    @OutputExport(name="hiringAgency", type=Boolean.class, parameters={})
    private Output<Boolean> hiringAgency;

    /**
     * @return Optional. Set to true if it is the hiring agency that post jobs for other employers. Defaults to false if not provided.
     * 
     */
    public Output<Boolean> getHiringAgency() {
        return this.hiringAgency;
    }
    /**
     * Optional. A URI that hosts the employer's company logo.
     * 
     */
    @OutputExport(name="imageUri", type=String.class, parameters={})
    private Output<String> imageUri;

    /**
     * @return Optional. A URI that hosts the employer's company logo.
     * 
     */
    public Output<String> getImageUri() {
        return this.imageUri;
    }
    /**
     * Optional. A list of keys of filterable Job.custom_attributes, whose corresponding `string_values` are used in keyword search. Jobs with `string_values` under these specified field keys are returned if any of the values matches the search keyword. Custom field values with parenthesis, brackets and special symbols won't be properly searchable, and those keyword queries need to be surrounded by quotes.
     * 
     */
    @OutputExport(name="keywordSearchableJobCustomAttributes", type=List.class, parameters={String.class})
    private Output<List<String>> keywordSearchableJobCustomAttributes;

    /**
     * @return Optional. A list of keys of filterable Job.custom_attributes, whose corresponding `string_values` are used in keyword search. Jobs with `string_values` under these specified field keys are returned if any of the values matches the search keyword. Custom field values with parenthesis, brackets and special symbols won't be properly searchable, and those keyword queries need to be surrounded by quotes.
     * 
     */
    public Output<List<String>> getKeywordSearchableJobCustomAttributes() {
        return this.keywordSearchableJobCustomAttributes;
    }
    /**
     * Required during company update. The resource name for a company. This is generated by the service when a company is created. The format is "projects/{project_id}/companies/{company_id}", for example, "projects/api-test-project/companies/foo".
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Required during company update. The resource name for a company. This is generated by the service when a company is created. The format is "projects/{project_id}/companies/{company_id}", for example, "projects/api-test-project/companies/foo".
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Optional. The employer's company size.
     * 
     */
    @OutputExport(name="size", type=String.class, parameters={})
    private Output<String> size;

    /**
     * @return Optional. The employer's company size.
     * 
     */
    public Output<String> getSize() {
        return this.size;
    }
    /**
     * Indicates whether a company is flagged to be suspended from public availability by the service when job content appears suspicious, abusive, or spammy.
     * 
     */
    @OutputExport(name="suspended", type=Boolean.class, parameters={})
    private Output<Boolean> suspended;

    /**
     * @return Indicates whether a company is flagged to be suspended from public availability by the service when job content appears suspicious, abusive, or spammy.
     * 
     */
    public Output<Boolean> getSuspended() {
        return this.suspended;
    }
    /**
     * Optional. The URI representing the company's primary web site or home page, for example, "https://www.google.com". The maximum number of allowed characters is 255.
     * 
     */
    @OutputExport(name="websiteUri", type=String.class, parameters={})
    private Output<String> websiteUri;

    /**
     * @return Optional. The URI representing the company's primary web site or home page, for example, "https://www.google.com". The maximum number of allowed characters is 255.
     * 
     */
    public Output<String> getWebsiteUri() {
        return this.websiteUri;
    }

    public interface BuilderApplicator {
        public void apply(CompanyArgs.Builder a);
    }
    private static io.pulumi.googlenative.jobs_v3.CompanyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.jobs_v3.CompanyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Company(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Company(String name) {
        this(name, CompanyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Company(String name, CompanyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Company(String name, CompanyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:jobs/v3:Company", name, args == null ? CompanyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Company(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:jobs/v3:Company", name, null, makeResourceOptions(options, id));
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
    public static Company get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Company(name, id, options);
    }
}