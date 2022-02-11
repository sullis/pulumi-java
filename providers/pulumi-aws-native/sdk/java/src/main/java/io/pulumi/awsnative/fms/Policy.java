// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.fms;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.fms.PolicyArgs;
import io.pulumi.awsnative.fms.outputs.PolicyIEMap;
import io.pulumi.awsnative.fms.outputs.PolicyResourceTag;
import io.pulumi.awsnative.fms.outputs.PolicyTag;
import io.pulumi.awsnative.fms.outputs.SecurityServicePolicyDataProperties;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="aws-native:fms:Policy")
public class Policy extends io.pulumi.resources.CustomResource {
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }
    @OutputExport(name="deleteAllPolicyResources", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> deleteAllPolicyResources;

    public Output</* @Nullable */ Boolean> getDeleteAllPolicyResources() {
        return this.deleteAllPolicyResources;
    }
    @OutputExport(name="excludeMap", type=PolicyIEMap.class, parameters={})
    private Output</* @Nullable */ PolicyIEMap> excludeMap;

    public Output</* @Nullable */ PolicyIEMap> getExcludeMap() {
        return this.excludeMap;
    }
    @OutputExport(name="excludeResourceTags", type=Boolean.class, parameters={})
    private Output<Boolean> excludeResourceTags;

    public Output<Boolean> getExcludeResourceTags() {
        return this.excludeResourceTags;
    }
    @OutputExport(name="includeMap", type=PolicyIEMap.class, parameters={})
    private Output</* @Nullable */ PolicyIEMap> includeMap;

    public Output</* @Nullable */ PolicyIEMap> getIncludeMap() {
        return this.includeMap;
    }
    @OutputExport(name="policyName", type=String.class, parameters={})
    private Output<String> policyName;

    public Output<String> getPolicyName() {
        return this.policyName;
    }
    @OutputExport(name="remediationEnabled", type=Boolean.class, parameters={})
    private Output<Boolean> remediationEnabled;

    public Output<Boolean> getRemediationEnabled() {
        return this.remediationEnabled;
    }
    @OutputExport(name="resourceTags", type=List.class, parameters={PolicyResourceTag.class})
    private Output</* @Nullable */ List<PolicyResourceTag>> resourceTags;

    public Output</* @Nullable */ List<PolicyResourceTag>> getResourceTags() {
        return this.resourceTags;
    }
    @OutputExport(name="resourceType", type=String.class, parameters={})
    private Output<String> resourceType;

    public Output<String> getPropResourceType() {
        return this.resourceType;
    }
    @OutputExport(name="resourceTypeList", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> resourceTypeList;

    public Output</* @Nullable */ List<String>> getResourceTypeList() {
        return this.resourceTypeList;
    }
    @OutputExport(name="resourcesCleanUp", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> resourcesCleanUp;

    public Output</* @Nullable */ Boolean> getResourcesCleanUp() {
        return this.resourcesCleanUp;
    }
    @OutputExport(name="securityServicePolicyData", type=SecurityServicePolicyDataProperties.class, parameters={})
    private Output<SecurityServicePolicyDataProperties> securityServicePolicyData;

    public Output<SecurityServicePolicyDataProperties> getSecurityServicePolicyData() {
        return this.securityServicePolicyData;
    }
    @OutputExport(name="tags", type=List.class, parameters={PolicyTag.class})
    private Output</* @Nullable */ List<PolicyTag>> tags;

    public Output</* @Nullable */ List<PolicyTag>> getTags() {
        return this.tags;
    }

    public Policy(String name, PolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:fms:Policy", name, args == null ? PolicyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Policy(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:fms:Policy", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Policy get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Policy(name, id, options);
    }
}
