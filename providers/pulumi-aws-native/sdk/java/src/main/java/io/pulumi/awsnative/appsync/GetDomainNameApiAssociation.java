// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appsync;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.appsync.inputs.GetDomainNameApiAssociationArgs;
import io.pulumi.awsnative.appsync.outputs.GetDomainNameApiAssociationResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDomainNameApiAssociation {
    private GetDomainNameApiAssociation() {}
    public interface BuilderApplicator {
        public void apply(GetDomainNameApiAssociationArgs.Builder a);
    }
    private static GetDomainNameApiAssociationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetDomainNameApiAssociationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Resource Type definition for AWS::AppSync::DomainNameApiAssociation
 * 
     */
    public static CompletableFuture<GetDomainNameApiAssociationResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Resource Type definition for AWS::AppSync::DomainNameApiAssociation
     * 
     */
    public static CompletableFuture<GetDomainNameApiAssociationResult> invokeAsync(GetDomainNameApiAssociationArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:appsync:getDomainNameApiAssociation", TypeShape.of(GetDomainNameApiAssociationResult.class), args == null ? GetDomainNameApiAssociationArgs.Empty : args, Utilities.withVersion(options));
    }
}