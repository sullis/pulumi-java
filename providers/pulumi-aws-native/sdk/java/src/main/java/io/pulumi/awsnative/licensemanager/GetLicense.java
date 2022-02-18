// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.licensemanager;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.licensemanager.inputs.GetLicenseArgs;
import io.pulumi.awsnative.licensemanager.outputs.GetLicenseResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetLicense {
/**
 * Resource Type definition for AWS::LicenseManager::License
 * 
 */
    public static CompletableFuture<GetLicenseResult> invokeAsync(GetLicenseArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:licensemanager:getLicense", TypeShape.of(GetLicenseResult.class), args == null ? GetLicenseArgs.Empty : args, Utilities.withVersion(options));
    }
}
